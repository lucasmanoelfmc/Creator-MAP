package exceptions;

public class alunoInexistenteException  extends RuntimeException{
    
    private static final long serialVersionUID = 1L;

    public alunoInexistenteException(String msg){
        super(msg);
    }

}