import classes.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João", 123);

        funcionario1.adicionarFuncoes("Diretor");
        funcionario1.adicionarFuncoes("Roteirista");
        funcionario1.adicionarFuncoes("Produtor");
        System.out.println(funcionario1.toString());
        funcionario1.atuar();
        funcionario1.dirigir();
    
    }
    
}
