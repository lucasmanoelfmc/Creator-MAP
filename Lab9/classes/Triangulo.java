package Lab9.classes;

import Lab9.interfaces.*;

public class Triangulo implements ConcreteElementIF {

    private Double lado1;
    private Double lado2;
    private Double lado3;
    private Double base;
    private Double altura;

    public Triangulo(Double lado1, Double lado2, Double lado3, Double base, Double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }


    @Override
    public void acceptVisit(VisitorIF visitorIF) {
        Double result = visitorIF.visitTriangulo(this);

        if (result != 0) {
            System.out.println(result);
        }
    }

    @Override
    public String toString() {
        return "Triangulo {" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", base=" + base +
                ", altura=" + altura +
                '}';
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


    public Double getLado3() {
        return lado3;
    }


    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }


    public Double getBase() {
        return base;
    }


    public void setBase(Double base) {
        this.base = base;
    }


    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
}
