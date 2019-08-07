package visit;

public class BElement implements Element {

    @Override
    public void attept(Visitor visitor) {
        visitor.visit(this);
    }
}
