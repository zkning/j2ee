package visit;

public class FactVisitor implements Visitor {

    @Override
    public void visit(AElement element) {
        System.out.println("Fact访问者访问A element" + element.toString());
    }

    @Override
    public void visit(BElement element) {
        System.out.println("Fact访问者访问B element" + element.toString());
    }
}
