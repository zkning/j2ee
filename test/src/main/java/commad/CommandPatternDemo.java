package commad;

/**
 * 命令执行客户端
 * 场景: 客户（发送购买或出售命令）->中间人(传递命令)->仓库(执行购买或售卖)
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        // 接受者对象Receiver
        Stock stock = new Stock();
        // 具体的命令对象
        BuyStock buyStock = new BuyStock(stock);
        // 具体的命令对象
        SellStock sellStock = new SellStock(stock);
        // 传递命令对象Invoker
        Broker broker = new Broker();
        // 接收购买命令
        broker.takeOrder(buyStock);
        // 接收出售命令
        broker.takeOrder(sellStock);
        // command Invoker（执行命令）
        broker.placeOrders();
    }
}
