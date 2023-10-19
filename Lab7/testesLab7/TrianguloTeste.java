package Lab7.testesLab7;
import Lab7.classesLab7.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrianguloTeste {

    Triangulo trianguloEq1;
    Triangulo trianguloEq2;
    Triangulo trianguloIs1;
    Triangulo trianguloIs2;
    Triangulo trianguloRt1;
    Triangulo trianguloRt2;

    @BeforeEach
    void setUp(){
        trianguloEq1 = Triangulo.getInstance(2, 2, 2);
        trianguloEq2 = Triangulo.getInstance(3, 3, 3);
        trianguloIs1 = Triangulo.getInstance(2, 2, 3);
        trianguloIs2 = Triangulo.getInstance(3, 3, 5);
        trianguloRt1 = Triangulo.getInstance(3, 4, 5);
        trianguloRt2 = Triangulo.getInstance(6, 8, 10);
    }

    @Test
    public void testeTrianguloEquilatero() {
        Assertions.assertEquals(trianguloEq2, trianguloEq1);
    }

    @Test
    public void testeTrianguloIsosceles() {
        Assertions.assertEquals(trianguloIs2, trianguloIs1);
    }

    @Test
    public void testeTrianguloRetangulo() {
        Assertions.assertEquals(trianguloRt2, trianguloRt1);
    }

    @Test
    public void testeLadoEquilatero() {
        Assertions.assertEquals(2, trianguloEq2.getLado1());
    }

    @Test
    public void testeLadoIsosceles() {
        Assertions.assertEquals(2, trianguloIs2.getLado1());
    }

    @Test
    public void testeLadoRetangulo() {
        Assertions.assertEquals(3, trianguloRt2.getLado1());
    }
    
}