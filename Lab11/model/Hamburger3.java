package Lab11.model;
import Lab11.enums.*;

public class Hamburger3 extends Hamburger {

    //  HAMBURGER 3 usa:
    //  ovo de granja
    //  pao frances
    //  presunto de peru
    //  queijo cheddar
    //  tomate normal

    @Override
    protected Ovo criaOvo() {
        return new Ovo(OvoEnum.Granja);
    }

    @Override
    protected Pao criaPao() {
        return new Pao(PaoEnum.Frances);
    }

    @Override
    protected Presunto criaPresunto() {
        return new Presunto(PresuntoEnum.Peru);
    }

    @Override
    protected Queijo criaQueijo() {
        return new Queijo(QueijoEnum.Cheddar);
    }
    
}
