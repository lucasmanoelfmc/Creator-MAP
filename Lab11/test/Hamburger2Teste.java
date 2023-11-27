package Lab11.test;
import Lab11.enums.*;
import Lab11.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Hamburger2Teste {

    Hamburger h2;
    Ovo ovo;
    Pao pao;
    Presunto presunto;
    Queijo queijo;
    Tomate tomate;

    @BeforeEach
    void setUp(){
        h2 = new Hamburger2();
        h2.montaHamburger();
    }

    @Test
    public void Ovo2Teste(){
        ovo = new Ovo(OvoEnum.Capoeira);
        Assertions.assertEquals(ovo.getOvoEnum(), h2.getOvo().getOvoEnum());
    }

    @Test
    public void Pao2Teste(){
        pao = new Pao(PaoEnum.Integral);
        Assertions.assertEquals(pao.getPaoEnum(), h2.getPao().getPaoEnum());
    }

    @Test
    public void Presunto2Teste(){
        presunto = new Presunto(PresuntoEnum.Frango);
        Assertions.assertEquals(presunto.getPresuntoEnum(), h2.getPresunto().getPresuntoEnum());
    }

    @Test
    public void Queijo2Teste(){
        queijo = new Queijo(QueijoEnum.Mussarela);
        Assertions.assertEquals(queijo.getQueijoEnum(), h2.getQueijo().getQueijoEnum());
    }

    @Test
    public void Tomate2Teste(){
        tomate = new Tomate(TomateEnum.Normal);
        Assertions.assertEquals(tomate.getTomateEnum(), h2.getTomate().getTomateEnum());
    }

    @Test
    public void String2Teste(){
        Assertions.assertEquals
        ("Hamburger [ovo: Capoeira, pao: Integral, presunto: Frango, queijo: Mussarela, tomate: Normal]", 
        h2.toString());
    }

}