package state;

public class BeginState implements State{
    @Override
    public void handle() {
        System.out.println("开始状态，开始工作。。。");
    }
}

class EndState implements State {

    @Override
    public void handle() {
        System.out.println("结束状态，完成工作。。。");
    }
}

