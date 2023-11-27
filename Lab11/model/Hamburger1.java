package Lab11.model;
import Lab11.enums.*;

public class Hamburger1 extends Hamburger {

    //  HAMBURGER 1 usa:
    //  ovo de capoeira
    //  pao bola
    //  presunto de frango
    //  queijo prato
    //  tomate normal

    @Override
    protected Ovo criaOvo() {
        return new Ovo(OvoEnum.Capoeira);
    }

    @Override
    protected Pao criaPao() {
        return new Pao(PaoEnum.Bola);
    }

    @Override
    protected Presunto criaPresunto() {
        return new Presunto(PresuntoEnum.Frango);
    }

    @Override
    protected Queijo criaQueijo() {
        return new Queijo(QueijoEnum.Prato);
    }

}
