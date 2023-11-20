package Lab10.test;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import Lab10.model.*;

public class OnibusTest {

    Onibus onibus1 = new Onibus("Onibus 1", 5);
    
    @Test
    public void TestId(){
        Assertions.assertEquals("Onibus 1", onibus1.getId());
    }

    @Test
    public void TestCapacidade(){
        Assertions.assertEquals(5, onibus1.getAssentosQnt());
    }

    @Test
    public void TestLotacao(){
        Assertions.assertEquals(0, onibus1.getLotacao());
    }

    @Test
    public void TestAssentoStatus(){
        Assertions.assertEquals(Status.DISPONIVEL, onibus1.getAssentos()[0].getStatus());
    }

    @Test
    public void TestAssentoNumero(){
        Assertions.assertEquals(1, onibus1.getAssentos()[0].getNumeracao());
    }


}
