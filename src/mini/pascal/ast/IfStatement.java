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
public class IfStatement extends Statement{
    public Expression expression;
    public Statement statement;
    public Statement statement2;

    public IfStatement(Expression expression, Statement statement) {
        this.expression = expression;
        this.statement = statement;
        super.type = "if";
    }

    public IfStatement(Expression expression, Statement statement, Statement statement2) {
        this.expression = expression;
        this.statement = statement;
        this.statement2 = statement2;
        super.type = "ifelse";
    }
    
    
    
    
}
