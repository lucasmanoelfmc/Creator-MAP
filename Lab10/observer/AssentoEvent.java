package Lab10.observer;
import java.util.EventObject;
import Lab10.model.Onibus;

public class AssentoEvent extends EventObject{

    private static final long serialVersionUID = 1L;

    public AssentoEvent(Onibus source) {
        super(source);
    }

}
