package Lab7.testesLab7;
import Lab7.classesLab7.Circulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class CirculoTeste {

    Circulo circulo1;
    Circulo circulo2;
    Circulo circulo3;
    Circulo circulo4;

    @BeforeEach
    void setUp(){
        circulo1 = Circulo.getInstance(3);
        circulo2 = Circulo.getInstance(4);
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testeCirculo1() {
        Assertions.assertEquals("Circulo [Raio: 3.0, Area: 28.26, Circunferencia: 18.84]", circulo1.toString());
    }

    @Test
    public void testeCirculo2() {
        Assertions.assertEquals("Circulo [Raio: 3.0, Area: 28.26, Circunferencia: 18.84]", circulo2.toString());
    }

    @Test
    public void testeRaio() {
        Assertions.assertEquals(3, circulo1.getRaio());
    }

    @Test
    public void testeArea() {
        Assertions.assertEquals(28.26, circulo1.getAreaCirculo());
    }

    @Test
    public void testeCircunferencia() {
        Assertions.assertEquals(18.84, circulo1.getCircunferenciaCirculo());
    }

    @Test
    public void testeIgualdade() {
        Assertions.assertEquals(circulo2, circulo1);
    }

    @Test
    public void testeExceptionZero() {
        circulo3 = Circulo.getInstance(0);
        expectedEx.expectMessage("O raio precisa ser positivo!");
    }

    @Test
    public void testeExceptionNegativo() {
        circulo4 = Circulo.getInstance(-1);
        expectedEx.expectMessage("O raio precisa ser positivo!");
    }

}