package parse;

/**
 * 创建实现了上述接口的实体类。
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(this.data);
    }
}
