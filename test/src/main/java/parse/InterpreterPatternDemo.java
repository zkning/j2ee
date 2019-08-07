package parse;


/**
 * client
 */
public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Expression expression = Context.getMaleExpression();
        System.out.println("John is male? " + expression.interpret("John"));

        expression = Context.getMarriedWomanExpression();
        System.out.println("Julie is a married women? " + expression.interpret("Married Julie"));
    }
}
