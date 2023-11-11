package Lab9.visitors;

import Lab9.classes.*;
import Lab9.interfaces.VisitorIF;

public class VisitorCalcularPerimetro implements VisitorIF {

    @Override
    public Double visitRetangulo(Retangulo retangulo) {
        return (retangulo.getAltura() + retangulo.getLargura()) * 2;
    }

    @Override
    public Double visitTriangulo(Triangulo triangulo) {
        return triangulo.getLado1() + triangulo.getLado2() + triangulo.getLado3();
    }

    @Override
    public Double visitCirculo(Circulo circulo) {
        return 2 * Math.PI * circulo.getRaio();
    }

    @Override
    public Double visitTrapezio(Trapezio trapezium) {
        return trapezium.getBaseMenor() + trapezium.getBaseMaior() + trapezium.getLado1() + trapezium.getLado2();
    }
}
