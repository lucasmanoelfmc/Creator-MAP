package Lab11.model;
import Lab11.enums.*;

public class Hamburger2 extends Hamburger {

    //  HAMBURGER 2 usa:
    //  ovo de capoeira
    //  pao integral
    //  presunto de frango
    //  queijo mussarela
    //  tomate normal

    @Override
    protected Ovo criaOvo() {
        return new Ovo(OvoEnum.Capoeira);
    }

    @Override
    protected Pao criaPao() {
        return new Pao(PaoEnum.Integral);
    }

    @Override
    protected Presunto criaPresunto() {
        return new Presunto(PresuntoEnum.Frango);
    }

    @Override
    protected Queijo criaQueijo() {
        return new Queijo(QueijoEnum.Mussarela);
    }
    
}
