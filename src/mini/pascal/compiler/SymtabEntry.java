/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pascal.compiler;

/**
 *
 * @author jorgecaballero
 */
public class SymtabEntry {
    String name;

    public SymtabEntry(String v) {
      name=v; 
    }

    public int kind() {
      return UNKNOWN; 
    }

    public String toString() {
      return("unknown "+name); 
    }

    static final int UNKNOWN = 12;
    static final int VAR = 13;
    static final int FUN = 14;
}

