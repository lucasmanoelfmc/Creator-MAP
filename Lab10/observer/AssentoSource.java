package Lab10.observer;
import java.util.ArrayList;
import java.util.List;

public class AssentoSource {

    private List<AssentoListener> assentoListener = new ArrayList<AssentoListener>();

    public synchronized void addAssentoListener(AssentoListener a){
        if(!assentoListener.contains(a)){
            assentoListener.add(a);
        }
    }

    public synchronized void removeAssentoListener(AssentoListener a){
        assentoListener.remove(a);
    }

}
