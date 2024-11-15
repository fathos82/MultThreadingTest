package semaphore;

import java.util.concurrent.Semaphore;

public class People implements Runnable {
    private final Semaphore semaphore;

    public People(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is trying to get a buoy...");
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " is using the buoy");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println(Thread.currentThread().getName() + " is leaving.");
            semaphore.release();
        }
    }
}
