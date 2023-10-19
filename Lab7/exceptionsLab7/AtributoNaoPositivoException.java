package Lab7.exceptionsLab7;

public class AtributoNaoPositivoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AtributoNaoPositivoException(String msg) {
        super(msg);
    }
    
}