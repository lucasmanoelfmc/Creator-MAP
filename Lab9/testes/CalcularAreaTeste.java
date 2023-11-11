package Lab9.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Lab9.classes.*;
import Lab9.visitors.VisitorCalcularArea;

public class CalcularAreaTeste {
    
    Triangulo triangulo;
    Retangulo retangulo;
    Circulo circulo;
    Trapezio trapezio;
    VisitorCalcularArea visitorArea;

    @BeforeEach
    void setUp() {
        triangulo = new Triangulo(6.0,6.0,6.0, 6.0, (6 * Math.cbrt(3)) / 2);
        retangulo = new Retangulo(6.0, 5.0);
        circulo = new Circulo(6.0);
        trapezio = new Trapezio(6.0, 14.0, 5.0, 5.0, (6.0 + 14.0) / 2);
        visitorArea = new VisitorCalcularArea();
    }

    @Test
    public void CalcularAreaTriangulo() {
        Assertions.assertEquals(Math.round((Math.pow(triangulo.getLado1(), 2) * Math.cbrt(3)) / 4),
                Math.round(visitorArea.visitTriangulo(triangulo)));
    }

    @Test
    public void CalcularAreaRetangulo() {
        Assertions.assertEquals(Math.round(retangulo.getAltura() * retangulo.getLargura()),
                Math.round(visitorArea.visitRetangulo(retangulo)));
    }

    @Test
    public void CalcularAreaCirculo() {
        Assertions.assertEquals(Math.round(Math.PI * Math.pow(circulo.getRaio(), 2)),
                Math.round(visitorArea.visitCirculo(circulo)));
    }

    @Test
    public void CalcularAreaTrapezio() {
        Assertions.assertEquals(Math.round(trapezio.getBaseMaior() + trapezio.getBaseMenor()) 
        * trapezio.getAltura() / 2,
                Math.round(visitorArea.visitTrapezio(trapezio)));
    }

}
