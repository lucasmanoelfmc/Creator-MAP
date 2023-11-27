package Lab11.model;
import Lab11.enums.PaoEnum;

public class Pao {
    private PaoEnum paoEnum;

    public Pao(PaoEnum paoEnum) {
        this.paoEnum = paoEnum;
    }

    public PaoEnum getPaoEnum() {
        return paoEnum;
    }

}
