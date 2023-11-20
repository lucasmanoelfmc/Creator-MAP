package Lab10.controller;
import Lab10.model.Onibus;

public class OnibusController {
    private Onibus onibus;

    public OnibusController(Onibus onibus) {
        this.onibus = onibus;
    }

    public void reservarPassagem() throws Exception {
        onibus.reservarAssento();
    }

    public void comprarPassagem() throws Exception {
        onibus.ocuparAssento();
    }
    
}
