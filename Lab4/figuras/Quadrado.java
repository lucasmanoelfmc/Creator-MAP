package figuras;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double areaQuadrado(){
        return lado * lado;
    }

    public double perimetroQuadrado(){
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + lado + "]";
    }

}