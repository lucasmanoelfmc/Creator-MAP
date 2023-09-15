package figuras;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double areaCirculo(){
        return raio * raio * 3.1415;
    }

    public double perimetroCirculo(){
        return 2 * 3.1415 * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
    }
    
}