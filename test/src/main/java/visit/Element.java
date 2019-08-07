package visit;

/**
 * 元素抽象类
 */
public interface Element {


    /**
     * 接收一个访问者
     * @param visitor
     */
    void attept(Visitor visitor);
}
