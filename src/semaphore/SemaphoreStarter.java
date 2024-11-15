package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreStarter {
    int peoplePermission = 5;
    public void start()  {
        Semaphore buoy = new Semaphore(peoplePermission);

        for (int i = 0; i < peoplePermission; i++) {
            Thread thread = new Thread(new People(buoy), "People-" + i);
            thread.start();
        }


    }
}
