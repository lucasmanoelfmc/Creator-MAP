package Lab7.testesLab7;
import Lab7.classesLab7.Quadrado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuadradoTeste {

    Quadrado quadrado1;
    Quadrado quadrado2;

    @BeforeEach
    void setUp(){
        quadrado1 = new Quadrado(3);
        quadrado2 = new Quadrado(4);
    }

    @Test
    public void testeQuadrado1() {
        Assertions.assertEquals("Quadrado [Lado: 3.0, Area: 9.0, Perimetro: 12.0]", quadrado1.toString());
    }

    @Test
    public void testeQuadrado2() {
        Assertions.assertEquals("Quadrado [Lado: 4.0, Area: 16.0, Perimetro: 16.0]", quadrado2.toString());
    }

    @Test
    public void testeLado() {
        Assertions.assertEquals(3.0, quadrado1.getLadoQuadrado());
    }

    @Test
    public void testeArea() {
        Assertions.assertEquals(9.0, quadrado1.getAreaQuadrado());
    }

    @Test
    public void testePerimetro() {
        Assertions.assertEquals(12.0, quadrado1.getPerimetroQuadrado());
    }

    @Test
    public void testeIgualdade() {
        Assertions.assertNotSame(quadrado1, quadrado2);
    }

}