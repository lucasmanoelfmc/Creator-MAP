package Lab9.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Lab9.classes.*;
import Lab9.visitors.VisitorDesenhar;

public class DesenhoTeste {

    Triangulo triangulo;
    Retangulo retangulo;
    Circulo circulo;
    Trapezio trapezio;
    VisitorDesenhar visitorDesenho;

    @BeforeEach
    void setUp() {
        triangulo = new Triangulo(6.0,6.0,6.0, 6.0, (6 * Math.cbrt(3)) / 2);
        retangulo = new Retangulo(6.0, 5.0);
        circulo = new Circulo(6.0);
        trapezio = new Trapezio(6.0, 14.0, 5.0, 5.0, (6.0 + 14.0) / 2);
        visitorDesenho = new VisitorDesenhar();
    }

    @Test
    public void DesenhoTriangulo() {
        Assertions.assertEquals(0.0, visitorDesenho.visitTriangulo(triangulo));
    }

    @Test
    public void DesenhoRetangulo() {
        Assertions.assertEquals(0.0, visitorDesenho.visitRetangulo(retangulo));
    }

    @Test
    public void DesenhoCirculo() {
        Assertions.assertEquals(0.0, visitorDesenho.visitCirculo(circulo));
    }

    @Test
    public void DesenhoTrapezio() {
        Assertions.assertEquals(0.0, visitorDesenho.visitTrapezio(trapezio));
    }
}
