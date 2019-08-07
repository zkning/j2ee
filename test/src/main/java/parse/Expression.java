package parse;

/**
 * 表达式接口
 */
public interface Expression {

    /**
     * 解析
     * @param context
     * @return
     */
    public boolean interpret(String context);
}
