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
public class Block {
    public VariableDeclarationList vdl;
    public Statements sp;

    public Block(VariableDeclarationList vdl) {
        this.vdl = vdl;
        this.sp = sp;
    }
    
    
}
