package testesLab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classesLab4.Quadrado;
import exceptionsLab4.FiguraComAtributoIgualAZeroException;
import exceptionsLab4.FiguraComAtributoNegativoException;

public class QuadradoTest {

    private Quadrado quadrado;

    @BeforeEach
    void setUp() {
        quadrado = new Quadrado(5);
    }

    @Test
    public void shouldThrowFiguraComAtributoIgualAZeroException() {
        Assertions.assertThrows(FiguraComAtributoIgualAZeroException.class, () -> {
            quadrado.setLado(0);
        });
    }

    @Test
    public void shoutThrowFiguraComAtributoNegativoException() {
        Assertions.assertThrows(FiguraComAtributoNegativoException.class, () -> {
            quadrado.setLado(-1);
        });
    }

    @Test
    public void shouldGetArea() {
        Assertions.assertEquals(Math.pow(quadrado.getLado(), 2), quadrado.getArea());
    }

    @Test
    public void shouldGetPerimetro() {
        Assertions.assertEquals(quadrado.getLado() * 4, quadrado.getPerimetro());
    }
}
