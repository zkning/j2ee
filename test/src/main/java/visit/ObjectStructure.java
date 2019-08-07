package visit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 数据结构类
 */
public class ObjectStructure {
    List<Element> elementList = new ArrayList<>();

    public void add(Element element) {
        this.elementList.add(element);
    }

    private Iterator<Element> getIterator() {
        return this.elementList.iterator();
    }

    public static void main(String[] args) {
        AElement aElement = new AElement();
        BElement bElement = new BElement();

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(aElement);
        objectStructure.add(bElement);
        Iterator<Element> iterator = objectStructure.getIterator();

        // 设置一个访问者
        FactVisitor factVisitor = new FactVisitor();
        while (iterator.hasNext()) {
            iterator.next().attept(factVisitor);
        }
    }
}
