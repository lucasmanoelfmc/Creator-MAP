package Lab10;
import Lab10.controller.OnibusController;
import Lab10.model.Onibus;
import Lab10.view.*;

public class MainLab10 {
    public static void main(String[] args) throws Exception {

        Onibus onibus = new Onibus("Onibus 1", 5);

        OnibusController controller = new OnibusController(onibus);
        PainelCentral painelCentral = new PainelCentral();
        PainelQuiosque painelQuiosque = new PainelQuiosque("Quiosque");

        onibus.addOnibusListener(painelCentral);
        onibus.addOnibusListener(painelQuiosque);

        controller.reservarPassagem();
        controller.comprarPassagem();
        
    }
}
