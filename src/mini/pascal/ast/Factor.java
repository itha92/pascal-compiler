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
public class Factor {
    public Factor factor;
    public Variable variable;
    public Expression expression;
    public String constant;
    public String type;

    public Factor(Factor factor) {
        this.factor = factor;
        this.type = "factor";
    }

    public Factor(Variable variable) {
        this.variable = variable;
        this.type = "variable";
    }

    public Factor(Expression expression) {
        this.expression = expression;
        this.type = "expression";
    }

    public Factor(String constant, String type) {
        this.constant = constant;
        this.type = type;
    }
    
    
}
