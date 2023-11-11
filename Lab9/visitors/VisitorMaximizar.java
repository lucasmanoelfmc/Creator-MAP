package Lab9.visitors;

import Lab9.classes.*;
import Lab9.interfaces.VisitorIF;

public class VisitorMaximizar implements VisitorIF {

    @Override
    public Double visitRetangulo(Retangulo retangulo) {
        retangulo.setAltura(retangulo.getAltura() * 2);
        retangulo.setLargura(retangulo.getLargura() * 2);

        System.out.println("Retângulo maximizado: " + retangulo);

        return 0.0;
    }

    @Override
    public Double visitTriangulo(Triangulo triangulo) {
        triangulo.setBase(triangulo.getBase() * 2);
        triangulo.setAltura(triangulo.getAltura() * 2);
        triangulo.setLado1(triangulo.getLado1() * 2);
        triangulo.setLado2(triangulo.getLado2() * 2);
        triangulo.setLado3(triangulo.getLado3() * 2);

        System.out.println("Triângulo maximizado: " + triangulo);

        return 0.0;
    }

    @Override
    public Double visitCirculo(Circulo circulo) {
        circulo.setRaio(circulo.getRaio() * 2);

        System.out.println("Círculo maximizado: " + circulo);

        return 0.0;
    }

    @Override
    public Double visitTrapezio(Trapezio trapezio) {
        trapezio.setBaseMaior(trapezio.getBaseMaior() * 2);
        trapezio.setBaseMenor(trapezio.getBaseMenor() * 2);
        trapezio.setLado1(trapezio.getLado1() * 2);
        trapezio.setLado2(trapezio.getLado2() * 2);
        trapezio.setAltura(trapezio.getAltura() * 2);

        System.out.println("Trapézio maximizado: " + trapezio);

        return 0.0;
    }


}