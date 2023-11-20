package Lab10.view;
import Lab10.model.Onibus;
import Lab10.observer.AssentoEvent;
import Lab10.observer.AssentoListener;

public class PainelQuiosque implements AssentoListener{

    private String nome;

    public PainelQuiosque(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void assentoOcupado(AssentoEvent e) {
        exibirInfo((Onibus)e.getSource());
    }

    @Override
    public void assentoReservado(AssentoEvent e) {
        exibirInfo((Onibus)e.getSource());
    }

    @Override
    public void assentoIndisponivel(AssentoEvent e) {
        exibirInfo((Onibus)e.getSource());
    }
    
    private void exibirInfo(Onibus onibus){
        System.out.println("----------------------------");
        System.out.println(getNome());
        System.out.println(onibus.getId());
        onibus.printerAssentos();
        System.out.println("----------------------------");
    }
    
}
