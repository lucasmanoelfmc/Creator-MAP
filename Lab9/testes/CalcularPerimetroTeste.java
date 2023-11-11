package Lab9.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Lab9.classes.*;
import Lab9.visitors.VisitorCalcularPerimetro;

public class CalcularPerimetroTeste {

    Triangulo triangulo;
    Retangulo retangulo;
    Circulo circulo;
    Trapezio trapezio;
    VisitorCalcularPerimetro visitorPerimetro;

    @BeforeEach
    void setUp() {
        triangulo = new Triangulo(6.0,6.0,6.0, 6.0, (6 * Math.cbrt(3)) / 2);
        retangulo = new Retangulo(6.0, 5.0);
        circulo = new Circulo(6.0);
        trapezio = new Trapezio(6.0, 14.0, 5.0, 5.0, (6.0 + 14.0) / 2);
        visitorPerimetro = new VisitorCalcularPerimetro();
    }

    @Test
    public void CalcularPerimetroTriangulo() {
        Assertions.assertEquals((triangulo.getLado1() + triangulo.getLado2() + triangulo.getLado3()),
                visitorPerimetro.visitTriangulo(triangulo));
    }

    @Test
    public void CalcularPerimetroRetangulo() {
        Assertions.assertEquals((retangulo.getAltura() + retangulo.getLargura()) * 2,
                visitorPerimetro.visitRetangulo(retangulo));
    }

    @Test
    public void CalcularPerimetroCirculo() {
        Assertions.assertEquals(2 * Math.PI * circulo.getRaio(),
                visitorPerimetro.visitCirculo(circulo));
    }

    @Test
    public void CalcularPerimetroTrapezio() {
        Assertions.assertEquals(trapezio.getBaseMenor() + trapezio.getBaseMaior() + trapezio.getLado1() 
        + trapezio.getLado2(),
                visitorPerimetro.visitTrapezio(trapezio));
    }
}
