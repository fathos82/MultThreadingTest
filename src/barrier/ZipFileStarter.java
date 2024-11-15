package barrier;

import java.util.concurrent.CyclicBarrier;

public class ZipFileStarter {


    public void start(){
        int numThreads = 3;

        CyclicBarrier barrier = new CyclicBarrier(numThreads, new ZipMerger());

        // Criando threads
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(new ZipFiler(barrier), "Thread-" + (i + 1));
            thread.start();
        }
    }
}

