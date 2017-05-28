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
public class Variable {
    public String id;
    public Expression expression;
    public String type;

    public Variable(Object id) {
        this.id = (String) id;
    }

    public Variable(Object id, Expression expression) {
        this.id =  (String) id;
        this.expression = expression;
    }


}
