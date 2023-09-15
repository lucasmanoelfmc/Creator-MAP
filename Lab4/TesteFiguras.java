import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TesteFiguras {

    private Circulo circulo1, circulo2;
    private Retangulo retangulo1, retangulo2;
    private Quadrado quadrado1, quadrado2;

    @BeforeEach
    void setUp() throws Exception{
        circulo1 = new Circulo(5);
        circulo2 = new Circulo(9);

        quadrado1 = new Quadrado(5);
        quadrado2 = new Quadrado(10);

        retangulo1 = new Retangulo(3, 4);
        retangulo2 = new Retangulo(5, 6);
    }

    @Test
    public void testeCirculo(){
        Assertions.assertEquals(circulo1.areaCirculo(), 44);
        Assertions.assertEquals(circulo1.perimetroCirculo(), 23);

        Assertions.assertEquals(circulo2.areaCirculo(), 10);
        Assertions.assertEquals(circulo2.perimetroCirculo(), 5);
    }

    @Test
    public void testeQuadrado(){
        Assertions.assertEquals(quadrado1.areaQuadrado(), 25);
        Assertions.assertEquals(quadrado1.perimetroQuadrado(), 20);

        Assertions.assertEquals(quadrado2.areaQuadrado(), 100);
        Assertions.assertEquals(quadrado2.perimetroQuadrado(), 40);
    }

    @Test
    public void testeRetangulo(){
        Assertions.assertEquals(retangulo1.areaRetangulo(), 12);
        Assertions.assertEquals(retangulo1.perimetroRetangulo(), 14);

        Assertions.assertEquals(retangulo2.areaRetangulo(), 30);
        Assertions.assertEquals(retangulo2.perimetroRetangulo(), 22);
    }
   
}