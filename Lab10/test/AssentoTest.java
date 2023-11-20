package Lab10.test;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import Lab10.model.*;

public class AssentoTest {

    Assento assento1 = new Assento(Status.DISPONIVEL, 1);

    @Test
    public void TestStatus(){
        Assertions.assertEquals(Status.DISPONIVEL, assento1.getStatus());
    }

    @Test
    public void TestNum(){
        Assertions.assertEquals(1, assento1.getNumeracao());
    }
    
}
