package Lab9.classes;

import Lab9.interfaces.*;

public class Trapezio implements ConcreteElementIF {

    private Double baseMenor;
    private Double baseMaior;
    private Double lado1;
    private Double lado2;
    private Double altura;

    public Trapezio(Double baseMenor, Double baseMaior, Double lado1, Double lado2, Double altura) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public void acceptVisit(VisitorIF visitorIF) {
        Double result = visitorIF.visitTrapezio(this);

        if (result != 0) {
            System.out.println(result);
        }
    }

    @Override
    public String toString() {
        return "Trapezio {" +
                "baseMenor=" + baseMenor +
                ", baseMaior=" + baseMaior +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", altura=" + altura +
                '}';
    }

    public Double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(Double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public Double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(Double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
