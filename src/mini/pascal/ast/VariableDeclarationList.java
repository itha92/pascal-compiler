/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pascal.ast;

import java.util.ArrayList;
import mini.pascal.compiler.SymTable;

/**
 *
 * @author jorgecaballero
 */
public class VariableDeclarationList {
    public ArrayList<VariableDeclaration> il;

    public VariableDeclarationList(VariableDeclaration vd) {
        il = new ArrayList<VariableDeclaration>();
        il.add(vd);
    }
    
    public VariableDeclarationList() {
        il = new ArrayList<VariableDeclaration>();
    }
    
    public void add_declaration(VariableDeclaration vd){
        il.add(vd);
    }

    void setSymTable(SymTable st) {
        for (int i = 0; i < il.size(); i++) {
            VariableDeclaration vd = il.get(i);
            Object type = vd.type.getType();
            
            String type_name;
            String symbol = "";
            
            Class<?> enclosingClass = type.getClass().getEnclosingClass();
            if (enclosingClass != null) {
              type_name = enclosingClass.getName();
            } else {
              type_name = type.getClass().getName();
            }
            
            if (type_name == "SimpleType") {
                SimpleType simplt = (SimpleType) type;
                symbol = simplt.type;
            }
            
            if (type_name == "ArrayType") {
                ArrayType arrty = (ArrayType) type;
                symbol = "a"+ arrty.type.type;
            }
            
            for (int j = 0; j < vd.ids.ids.size(); j++) {
                boolean isNew = st.enter(vd.ids.ids.get(j), symbol);
                
                if (!isNew) {
                    System.out.println("Variable" + vd.ids.ids.get(j) + "esta declarada mas de una vez" );
                }
            }
            
            
        }
    }
    
    
}
