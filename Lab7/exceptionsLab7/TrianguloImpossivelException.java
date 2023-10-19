package Lab7.exceptionsLab7;

public class TrianguloImpossivelException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TrianguloImpossivelException(String msg) {
        super(msg);
    }
    
}