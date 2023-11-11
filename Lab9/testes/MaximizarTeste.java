package Lab9.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Lab9.classes.*;
import Lab9.visitors.VisitorMaximizar;

public class MaximizarTeste {

    Triangulo triangulo;
    Retangulo retangulo;
    Circulo circulo;
    Trapezio trapezio;
    VisitorMaximizar visitorMaximizar;

    @BeforeEach
    void setUp() {
        triangulo = new Triangulo(6.0,6.0,6.0, 6.0, (6 * Math.cbrt(3)) / 2);
        retangulo = new Retangulo(6.0, 5.0);
        circulo = new Circulo(6.0);
        trapezio = new Trapezio(6.0, 14.0, 5.0, 5.0, (6.0 + 14.0) / 2);
        visitorMaximizar = new VisitorMaximizar();
    }

    @Test
    public void MaximizarTriangulo() {
        visitorMaximizar.visitTriangulo(triangulo);
        Assertions.assertEquals(12.0, triangulo.getLado1());
        Assertions.assertEquals(12.0, triangulo.getLado2());
        Assertions.assertEquals(12.0, triangulo.getLado3());
        Assertions.assertEquals(12.0, triangulo.getBase());
        Assertions.assertEquals(((6 * Math.cbrt(3)) / 2) * 2, triangulo.getAltura());
        Assertions.assertEquals(0.0, visitorMaximizar.visitTriangulo(triangulo));
    }

    @Test
    public void MaximizarRetangulo() {
        visitorMaximizar.visitRetangulo(retangulo);
        Assertions.assertEquals(12.0, retangulo.getAltura());
        Assertions.assertEquals(10.0, retangulo.getLargura());
        Assertions.assertEquals(0.0, visitorMaximizar.visitRetangulo(retangulo));
    }

    @Test
    public void MaximizarCirculo() {
        visitorMaximizar.visitCirculo(circulo);
        Assertions.assertEquals(12.0, circulo.getRaio());
        Assertions.assertEquals(0.0, visitorMaximizar.visitCirculo(circulo));
    }

    @Test
    public void MaximizarTrapezio() {
        visitorMaximizar.visitTrapezio(trapezio);
        Assertions.assertEquals(12.0, trapezio.getBaseMenor());
        Assertions.assertEquals(28.0, trapezio.getBaseMaior());
        Assertions.assertEquals(10.0, trapezio.getLado1());
        Assertions.assertEquals(10.0, trapezio.getLado2());
        Assertions.assertEquals(((6.0 + 14.0) / 2) * 2, trapezio.getAltura());
    }
}
