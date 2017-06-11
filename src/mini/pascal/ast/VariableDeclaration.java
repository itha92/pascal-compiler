/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pascal.ast;

/**
 *
 * @author jorgecaballero
 */
public class VariableDeclaration{
    public IdentifierList ids;
    public Type type;

    public VariableDeclaration(IdentifierList ids, Type type) {
        this.ids = ids;
        this.type = type;
    }

}
