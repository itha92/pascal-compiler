/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pascal.ast;

import mini.pascal.compiler.SymTable;

/**
 *
 * @author jorgecaballero
 */
public class PascalProgram implements AST {
    public String id;
    public Block block;

    public PascalProgram(String id, Block block) {
        this.id = id;
        this.block = block;
    }

    public SymTable st;
    
    public void setSymtabs() {          // calculate symbol table entries
        st = new SymTable();            // set input variables
        //block.vdl.setSymTable(st);
      }
}
