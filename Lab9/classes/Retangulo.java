package Lab9.classes;

import Lab9.interfaces.*;

public class Retangulo implements ConcreteElementIF {

    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void acceptVisit(VisitorIF visitorIF) {
        Double result = visitorIF.visitRetangulo(this);

        if (result != 0.0) {
            System.out.println(result);
        }
    }

    @Override
    public String toString() {
        return "Retangulo {" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

}