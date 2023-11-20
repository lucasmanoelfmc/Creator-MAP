package Lab10.model;
import java.util.ArrayList;
import java.util.Collection;

import Lab10.observer.AssentoEvent;
import Lab10.observer.AssentoListener;

public class Onibus {

    private String id;
    private Assento[] assentos;
    private int lotacao;

    private Collection<AssentoListener> assentoListener;

    public Onibus(String id, int capacidadeMax) {
        this.id = id;
        assentoListener = new ArrayList<AssentoListener>();
        inicializar(capacidadeMax);
    }

    private void inicializar(int capacidadeMax){
        assentos = new Assento[capacidadeMax];
        for (int i = 0; i < assentos.length; i++){
            assentos[i] = new Assento(Status.DISPONIVEL, i+1);
        }
    }

    public String getId() {
        return id;
    }

    public Assento[] getAssentos() {
        return assentos;
    }

    public int getLotacao() {
        return lotacao;
    }

    public int getAssentosQnt(){
        return assentos.length;
    }

    public boolean estaLotado(){
        return getLotacao() == assentos.length;
    }

    public void incrementaLotacao(){
        this.lotacao++;
    }

    public void reservarAssento() throws Exception{
        if(!estaLotado()){
            Assento assento = procurarAssentoDisponivel();
            assento.setStatus(Status.RESERVADO);
            incrementaLotacao();
        }
        else{
            throw new Exception("Lotado");
        }
        disparaAssentoReservado();
    }

    public void ocuparAssento() throws Exception{
        if(!estaLotado()){
            Assento assento = procurarAssentoDisponivel();
            assento.setStatus(Status.INDISPONIVEL);
            incrementaLotacao();
        }
        else{
            throw new Exception("Lotado");
        }
        disparaAssentoOcupado();
    }

    private Assento procurarAssentoDisponivel(){
        for (Assento assento : assentos){
            if(assento.getStatus() == Status.DISPONIVEL){
                return assento;
            }
        }
        return null;
    }

    public void printerAssentos(){
        for (Assento assento : assentos){
            System.out.println("[Assento nº " + assento.getNumeracao() + "; Status: " + 
            assento.getStatus().getStatus() +"]");
        }
    }

    public synchronized void addOnibusListener(AssentoListener a){
        if(!assentoListener.contains(a)){
            assentoListener.add(a);
        }
    }

    public synchronized void removeOnibusListener(AssentoListener a){
        assentoListener.remove(a);
    }

    public void disparaAssentoOcupado(){
        AssentoEvent event = new AssentoEvent(this);
        
        for(AssentoListener listener : assentoListener){
            listener.assentoOcupado(event);
        }
    }

    public void disparaAssentoReservado(){
        AssentoEvent event = new AssentoEvent(this);
        
        for(AssentoListener listener : assentoListener){
            listener.assentoReservado(event);
        }
    }

}
