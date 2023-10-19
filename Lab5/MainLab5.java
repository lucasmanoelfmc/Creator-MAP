import classesLab5.Filme;
import classesLab5.Funcionario;

public class MainLab5 {
    
    public static void main(String[] args) {

        Filme filme1 = new Filme("O Senhor dos Anéis: A Sociedade do Anel", 2001);
        Filme filme2 = new Filme("O Senhor dos Anéis: As Duas Torres", 2002);
        Filme filme3 = new Filme("O Senhor dos Anéis: O Retorno do Rei", 2003);

        Funcionario funcionario1 = new Funcionario("Peter Jackson", 111);
        
        funcionario1.adicionarFuncoes("Diretor");
        funcionario1.adicionarFuncoes("Roteirista");

        filme1.vincularFuncionarioFilme(filme1, funcionario1);
        filme2.vincularFuncionarioFilme(filme2, funcionario1);
        filme3.vincularFuncionarioFilme(filme3, funcionario1);

        funcionario1.fichaFuncionario();
        funcionario1.atuar();
        funcionario1.dirigir();
        funcionario1.escrever();

        Funcionario funcionario2 = new Funcionario("Elijah Wood", 222);

        funcionario2.adicionarFuncoes("Ator");

        filme1.vincularFuncionarioFilme(filme1, funcionario2);
        filme2.vincularFuncionarioFilme(filme2, funcionario2);
        filme3.vincularFuncionarioFilme(filme3, funcionario2);

        funcionario2.fichaFuncionario();
        funcionario2.atuar();
        funcionario2.dirigir();
        funcionario2.escrever();

        filme1.adicionarTrilhaSonora("Flaming Red Hair");
        filme1.adicionarTrilhaSonora("A Knife in the Dark");
        
        filme1.fichaFilme();
    
    }

}