package commad;

/**
 * 卖货命令实例
 */
public class SellStock implements Order {
    private Stock absStock;

    public SellStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        this.absStock.sell();
    }
}
