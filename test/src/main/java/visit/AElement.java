package visit;

public class AElement implements Element {
    @Override
    public void attept(Visitor visitor) {
        visitor.visit(this);
    }
}
