package Lab10.observer;

import java.util.EventListener;

public interface AssentoListener extends EventListener{

    void assentoOcupado(AssentoEvent e);

    void assentoReservado(AssentoEvent e);

    void assentoIndisponivel(AssentoEvent e);

}
