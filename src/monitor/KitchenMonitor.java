package monitor;

import java.util.ArrayList;
import java.util.List;

public class KitchenMonitor {
    List<String> orders = new ArrayList<>();

    public synchronized void addOrder(String order) {
        orders.add(order);
        System.out.println("Added order: " + order);
        notify();
    }
    public synchronized String collectOrder() throws InterruptedException {
        if (orders.isEmpty()) {
            wait();
        }
        String order = orders.removeFirst();
        notify();
        return order;
    }
}
