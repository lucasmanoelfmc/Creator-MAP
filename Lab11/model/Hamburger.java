package Lab11.model;
import Lab11.enums.*;

public class Hamburger {
    private Ovo ovo;
    private Pao pao;
    private Presunto presunto;
    private Queijo queijo;
    private Tomate tomate;

    private Hamburger criaHamburger(){
        return new Hamburger();
    }

    public Hamburger montaHamburger(){
        Hamburger umHamburger = criaHamburger();
        ovo = criaOvo();
        pao = criaPao();
        presunto = criaPresunto();
        queijo = criaQueijo();
        tomate = criaTomate();
        return umHamburger;
    }

    protected Ovo criaOvo(){
        return new Ovo(OvoEnum.Normal);
    }

    protected Pao criaPao(){
        return new Pao(PaoEnum.Normal);
    }

    protected Presunto criaPresunto(){
        return new Presunto(PresuntoEnum.Normal);
    }

    protected Queijo criaQueijo(){
        return new Queijo(QueijoEnum.Normal);
    }

    protected Tomate criaTomate(){
        return new Tomate(TomateEnum.Normal);
    }

    //  Gets
    public Ovo getOvo() {
        return ovo;
    }
    public Pao getPao() {
        return pao;
    }
    public Presunto getPresunto() {
        return presunto;
    }
    public Queijo getQueijo() {
        return queijo;
    }
    public Tomate getTomate() {
        return tomate;
    }

    @Override
    public String toString() {
        return "Hamburger [" +
            "ovo: " + ovo.getOvoEnum() + ", " +
            "pao: " + pao.getPaoEnum() + ", " +
            "presunto: " + presunto.getPresuntoEnum() + ", " +
            "queijo: " + queijo.getQueijoEnum() + ", " +
            "tomate: " + tomate.getTomateEnum() + "]";
    }

}
