package figuras;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double areaRetangulo(){
        return altura * largura;
    }

    public double perimetroRetangulo(){
        return (2 * altura) + (2 * largura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Retangulo [altura=" + altura + ", largura=" + largura + "]";
    }
    
}