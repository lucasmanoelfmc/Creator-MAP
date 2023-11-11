package Lab9.visitors;

import Lab9.classes.*;
import Lab9.interfaces.VisitorIF;

public class VisitorDesenhar implements VisitorIF {

    @Override
    public Double visitRetangulo(Retangulo retangulo) {
        System.out.println("Desenhando retangulo..." + retangulo.toString());

        return 0.0;
    }

    @Override
    public Double visitTriangulo(Triangulo triangulo) {
        System.out.println("Desenhando triangulo..." + triangulo.toString());

        return 0.0;
    }

    @Override
    public Double visitCirculo(Circulo circulo) {
        System.out.println("Desenhando circulo..." + circulo.toString());

        return 0.0;
    }

    @Override
    public Double visitTrapezio(Trapezio trapezio) {
        System.out.println("Desenhando trapezio..." + trapezio.toString());

        return 0.0;
    }
}
