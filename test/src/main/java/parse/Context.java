package parse;

public class Context {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("julie");
        Expression married  = new TerminalExpression("married");
        return new AndExpression(julie, married);
    }
}
