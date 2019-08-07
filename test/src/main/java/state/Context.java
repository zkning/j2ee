package state;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doing() {
        state.handle();
    }

    public static void main(String[] args) {
        State begin = new BeginState();
        Context context = new Context();
        context.setState(begin);
        context.doing();

        State end = new EndState();
        context.setState(end);
        context.doing();

    }
}
