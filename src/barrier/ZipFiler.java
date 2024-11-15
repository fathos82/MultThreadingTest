package barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ZipFiler implements Runnable {
    private final CyclicBarrier barrier;

    public ZipFiler(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {

        try {
            System.out.println("Zipping Part File...");
            Thread.sleep(4000);
            System.out.println("Terminating Zipping Part File...");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
