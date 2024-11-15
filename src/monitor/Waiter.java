package monitor;


public class Waiter extends Thread {
    private final KitchenMonitor kitchenMonitor;
    public Waiter(KitchenMonitor kitchenMonitor) {
        this.kitchenMonitor = kitchenMonitor;
    }
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                String oder = kitchenMonitor.collectOrder();
                System.out.println("Waiter collects "+ oder);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
