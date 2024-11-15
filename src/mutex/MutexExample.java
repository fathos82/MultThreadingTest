package mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexExample {
    int orderCount = 0;
    private final Lock mutex = new ReentrantLock();


    public void addOrder(){
        mutex.lock(); // Adquire o lock
        try {
            for (int i = 0; i < 5; i++) {
                orderCount++;
            }
            System.out.println(orderCount+ "Orders added.");
        } finally {
            mutex.unlock(); // Garante que o lock será liberado
        }    }

    public void removeOrder(){
        mutex.lock();
        orderCount--;
        System.out.println(orderCount+ "Orders removed.");
        mutex.unlock();
    }

    public void start(){

        Thread produtor1 = new Thread(this::addOrder, "Productor 1");
        Thread produtor2 = new Thread(this::addOrder, "Productor 2");

        Thread consumer1 = new Thread(this::removeOrder, "Consumer 1");
        Thread consumer2 = new Thread(this::removeOrder, "Consumer 2");

        produtor1.start();
        consumer1.start();


        try {
            produtor1.join();
            produtor2.join();
            consumer1.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println( orderCount+ "Orders started.");


    }
}
