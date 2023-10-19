package exceptionsLab6;

public class itemInexistenteException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;

    public itemInexistenteException(String msg){
        super(msg);
    }

}