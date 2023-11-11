package Lab9.classes;

import Lab9.interfaces.*;

public class Circulo implements ConcreteElementIF {

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public void acceptVisit(VisitorIF visitorIF) {
        Double result = visitorIF.visitCirculo(this);

        if (result != 0.0) {
            System.out.println(result);
        }
    }

    @Override
    public String toString() {
        return "Circulo {" +
                "raio=" + raio +
                '}';
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
}
