package commad;

import java.util.ArrayList;
import java.util.List;

/**
 * 经纪人(代理)
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    /**
     * 添加命令
     * @param order
     */
    public void takeOrder(Order order){
        orderList.add(order);
    }

    /**
     *
     */
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
