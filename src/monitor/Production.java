package monitor;



public class Production extends Thread {
    private static int orderId = 0;

    private final KitchenMonitor kitchenMonitor;
    public Production(KitchenMonitor kitchenMonitor) {
        this.kitchenMonitor = kitchenMonitor;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            kitchenMonitor.addOrder("Order "+(orderId++));;
        }

    }
}
