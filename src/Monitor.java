import java.util.ArrayList;
import java.util.List;

public class Monitor {
    List<String> itens = new ArrayList<>();

    public synchronized void addItem(String string){
        itens.add(string);
        notify();
    }

    public synchronized String removeItem() throws InterruptedException {
        while (itens.isEmpty()) {
            wait();
        }
        return itens.removeFirst();
    }
}
