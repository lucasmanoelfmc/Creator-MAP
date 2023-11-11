package Lab9.visitors;

import Lab9.classes.*;
import Lab9.interfaces.VisitorIF;

public class VisitorCalcularArea implements VisitorIF {

    @Override
    public Double visitRetangulo(Retangulo retangulo) {
        return retangulo.getAltura() * retangulo.getLargura();
    }

    @Override
    public Double visitTriangulo(Triangulo triangulo) {
        return (triangulo.getBase() * triangulo.getAltura()) / 2;
    }

    @Override
    public Double visitCirculo(Circulo circulo) {
        return Math.PI * Math.pow(circulo.getRaio(), 2);
    }

    @Override
    public Double visitTrapezio(Trapezio trapezio) {
        return ((trapezio.getBaseMaior() + trapezio.getBaseMenor()) * trapezio.getAltura()) / 2;
    }
}
