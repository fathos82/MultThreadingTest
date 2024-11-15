public class Producer extends Thread {
    private final Monitor monitor;

    public Producer(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            String item = "Item "+i;
            System.out.println("ADD "+item);
            monitor.addItem(item);
        }
    }
}
