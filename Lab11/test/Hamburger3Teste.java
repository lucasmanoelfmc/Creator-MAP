package Lab11.test;
import Lab11.enums.*;
import Lab11.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Hamburger3Teste {

    Hamburger h3;
    Ovo ovo;
    Pao pao;
    Presunto presunto;
    Queijo queijo;
    Tomate tomate;

    @BeforeEach
    void setUp(){
        h3 = new Hamburger3();
        h3.montaHamburger();
    }

    @Test
    public void Ovo3Teste(){
        ovo = new Ovo(OvoEnum.Granja);
        Assertions.assertEquals(ovo.getOvoEnum(), h3.getOvo().getOvoEnum());
    }

    @Test
    public void Pao3Teste(){
        pao = new Pao(PaoEnum.Frances);
        Assertions.assertEquals(pao.getPaoEnum(), h3.getPao().getPaoEnum());
    }

    @Test
    public void Presunto3Teste(){
        presunto = new Presunto(PresuntoEnum.Peru);
        Assertions.assertEquals(presunto.getPresuntoEnum(), h3.getPresunto().getPresuntoEnum());
    }

    @Test
    public void Queijo3Teste(){
        queijo = new Queijo(QueijoEnum.Cheddar);
        Assertions.assertEquals(queijo.getQueijoEnum(), h3.getQueijo().getQueijoEnum());
    }

    @Test
    public void Tomate3Teste(){
        tomate = new Tomate(TomateEnum.Normal);
        Assertions.assertEquals(tomate.getTomateEnum(), h3.getTomate().getTomateEnum());
    }

    @Test
    public void String3Teste(){
        Assertions.assertEquals
        ("Hamburger [ovo: Granja, pao: Frances, presunto: Peru, queijo: Cheddar, tomate: Normal]", 
        h3.toString());
    }

}