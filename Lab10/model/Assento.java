package Lab10.model;

public class Assento {

    private Status status;
    private int numeracao;

    public Assento(Status status, int numeracao) {
        this.status = status;
        this.numeracao = numeracao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    @Override
    public String toString() {
        return "Assento [status=" + status + ", numeracao=" + numeracao + "]";
    }

    
}
