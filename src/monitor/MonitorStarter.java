package monitor;

public class MonitorStarter {
    public  void start() {
        KitchenMonitor monitor = new KitchenMonitor();
        Production production1 = new Production(monitor);
        Production production2 = new Production(monitor);
        Production production3 = new Production(monitor);

        Waiter waiter1 = new Waiter(monitor);
        Waiter waiter2 = new Waiter(monitor);
        Waiter waiter3 = new Waiter(monitor);

        production1.start();
    //        production2.start();
    //        production3.start();
        waiter1.start();
//        waiter2.start();
//        waiter3.start();

        try {
            production1.join();
//            production2.join();
//            production3.join();
            waiter1.join();
//            waiter2.join();
//            waiter3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
