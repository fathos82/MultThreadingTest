package barrier;

public class ZipMerger implements Runnable {
    @Override
    public void run() {

        try {
            System.out.println("All Zipers terminated...");
            System.out.println("Now we merge the Zipers into the zip file...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All Zipers terminated...");
    }
}
