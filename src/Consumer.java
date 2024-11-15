public class Consumer extends Thread {
    private final Monitor monitor;

    public Consumer(Monitor monitor) {
        this.monitor = monitor;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(monitor.removeItem());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
