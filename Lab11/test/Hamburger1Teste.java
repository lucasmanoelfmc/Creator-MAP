package Lab11.test;
import Lab11.enums.*;
import Lab11.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Hamburger1Teste {

    Hamburger h1;
    Ovo ovo;
    Pao pao;
    Presunto presunto;
    Queijo queijo;
    Tomate tomate;

    @BeforeEach
    void setUp(){
        h1 = new Hamburger1();
        h1.montaHamburger();
    }

    @Test
    public void Ovo1Teste(){
        ovo = new Ovo(OvoEnum.Capoeira);
        Assertions.assertEquals(ovo.getOvoEnum(), h1.getOvo().getOvoEnum());
    }

    @Test
    public void Pao1Teste(){
        pao = new Pao(PaoEnum.Bola);
        Assertions.assertEquals(pao.getPaoEnum(), h1.getPao().getPaoEnum());
    }

    @Test
    public void Presunto1Teste(){
        presunto = new Presunto(PresuntoEnum.Frango);
        Assertions.assertEquals(presunto.getPresuntoEnum(), h1.getPresunto().getPresuntoEnum());
    }

    @Test
    public void Queijo1Teste(){
        queijo = new Queijo(QueijoEnum.Prato);
        Assertions.assertEquals(queijo.getQueijoEnum(), h1.getQueijo().getQueijoEnum());
    }

    @Test
    public void Tomate1Teste(){
        tomate = new Tomate(TomateEnum.Normal);
        Assertions.assertEquals(tomate.getTomateEnum(), h1.getTomate().getTomateEnum());
    }

    @Test
    public void String1Teste(){
        Assertions.assertEquals
        ("Hamburger [ovo: Capoeira, pao: Bola, presunto: Frango, queijo: Prato, tomate: Normal]", 
        h1.toString());
    }

}
