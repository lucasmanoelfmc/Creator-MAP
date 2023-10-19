package testesLab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classesLab4.Retangulo;
import exceptionsLab4.FiguraComAtributoIgualAZeroException;
import exceptionsLab4.FiguraComAtributoNegativoException;


public class RetanguloTest {

    private Retangulo retangulo;

    @BeforeEach
    void setUp() throws Exception {
        retangulo = new Retangulo(5, 6);
    }

    @Test
    public void shouldThrowFiguraComAtributoIgualAZeroExceptionWhenBaseIsZero() {
        Assertions.assertThrows(FiguraComAtributoIgualAZeroException.class, () -> {
            retangulo.setBase(0);
        });
    }

    @Test
    public void shoutThrowFiguraComAtributoNegativoExceptionWhenBaseIsNegative() {
        Assertions.assertThrows(FiguraComAtributoNegativoException.class, () -> {
            retangulo.setBase(-1);
        });
    }

    @Test
    public void shouldThrowFiguraComAtributoIgualAZeroExceptionWhenAlturaIsZero() {
        Assertions.assertThrows(FiguraComAtributoIgualAZeroException.class, () -> {
            retangulo.setAltura(0);
        });
    }

    @Test
    public void shoutThrowFiguraComAtributoNegativoExceptionWhenAlturaIsNegative() {
        Assertions.assertThrows(FiguraComAtributoNegativoException.class, () -> {
            retangulo.setAltura(-1);
        });
    }

    @Test
    public void shouldGetArea() {
        Assertions.assertEquals(retangulo.getBase() * retangulo.getAltura(), retangulo.getArea());
    }

    @Test
    public void shouldGetPerimetro() {
        Assertions.assertEquals((retangulo.getBase() + retangulo.getAltura()) * 2, retangulo.getPerimetro());
    }


}
