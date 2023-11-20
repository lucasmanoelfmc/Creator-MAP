package Lab10.view;
import Lab10.model.Onibus;
import Lab10.observer.AssentoEvent;
import Lab10.observer.AssentoListener;


public class PainelCentral implements AssentoListener {

    @Override
    public void assentoOcupado(AssentoEvent e) {
        listaStatusAssentos((Onibus)e.getSource());
    }

    @Override
    public void assentoReservado(AssentoEvent e) {
        listaStatusAssentos((Onibus)e.getSource());
    }

    @Override
    public void assentoIndisponivel(AssentoEvent e) {
        listaStatusAssentos((Onibus)e.getSource());
    }

    private void listaStatusAssentos(Onibus onibus){
        System.out.println("----------------------------");
        System.out.println("Painel Central");
        System.out.println(onibus.getId());
        onibus.printerAssentos();
        System.out.println("----------------------------");
    }

}
