package Lab11.model;
import Lab11.enums.QueijoEnum;

public class Queijo {
    private QueijoEnum queijoEnum;

    public Queijo(QueijoEnum queijoEnum) {
        this.queijoEnum = queijoEnum;
    }

    public QueijoEnum getQueijoEnum() {
        return queijoEnum;
    }

}
