import barrier.ZipFileStarter;
import monitor.MonitorStarter;
import semaphore.SemaphoreStarter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args)  {

//        MonitorStarter starter = new MonitorStarter();
//        starter.start();

//        ZipFileStarter starter2 = new ZipFileStarter();
//        starter2.start();

        SemaphoreStarter starter3 = new SemaphoreStarter();
        starter3.start();


    }
}