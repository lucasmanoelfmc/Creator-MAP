package testes;
import classes.Funcionario;
import classes.Filme;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestesGloboFilmes {

    private Filme filme1;
    private Filme filme2;
    private Funcionario funcionario1;
    private Funcionario funcionario2;
    private Funcionario funcionario3;

    @BeforeEach
    void setUp() throws Exception{
        funcionario1 = new Funcionario("Arthur", 111);
        funcionario1.adicionarFuncoes("Diretor");
        funcionario1.adicionarFuncoes("Roteirista");

        funcionario2 = new Funcionario("Bruno", 222);
        funcionario2.adicionarFuncoes("Ator");

        funcionario3 = new Funcionario("Carlos", 333);
        funcionario3.adicionarFuncoes("Ator");
        funcionario3.adicionarFuncoes("Roteirista");

        filme1 = new Filme("O melhor filme do ano", 2023);

        filme1.adicionarTrilhaSonora("Soundtrack #1");
        filme1.adicionarTrilhaSonora("Soundtrack #2");

        filme1.vincularFuncionarioFilme(filme1, funcionario1);
        filme1.vincularFuncionarioFilme(filme1, funcionario2);
        filme1.vincularFuncionarioFilme(filme1, funcionario3);

        filme2 = new Filme("Um filme chato", 2010);

        filme2.adicionarTrilhaSonora("Soundtrack #3");
        filme2.adicionarTrilhaSonora("Soundtrack #4");

        filme2.vincularFuncionarioFilme(filme2, funcionario3);


    }

    @Test
    public void testeNomesFuncionarios(){
        Assertions.assertEquals(funcionario1.getNomeFuncionario(), "Arthur");
        Assertions.assertEquals(funcionario2.getNomeFuncionario(), "Bruno");
        Assertions.assertEquals(funcionario3.getNomeFuncionario(), "Carlos");
    }

    @Test
    public void testeNomesFilmes(){
        Assertions.assertEquals(funcionario1.getFilmografia().get(0).getNomeFilme(), "O melhor filme do ano");
        Assertions.assertEquals(funcionario2.getFilmografia().get(0).getNomeFilme(), "O melhor filme do ano");
        Assertions.assertEquals(funcionario3.getFilmografia().get(0).getNomeFilme(), "O melhor filme do ano");
        Assertions.assertEquals(funcionario3.getFilmografia().get(1).getNomeFilme(), "Um filme chato");
    }

    @Test
    public void testeFalsoNomesFilmes(){
        Assertions.assertNotSame(funcionario1.getFilmografia().get(0).getNomeFilme(), "Um filme chato");
        Assertions.assertNotSame(funcionario2.getFilmografia().get(0).getNomeFilme(), "Um filme chato");
        Assertions.assertNotSame(funcionario3.getFilmografia().get(1).getNomeFilme(), "O melhor filme do ano");
        Assertions.assertNotSame(funcionario3.getFilmografia().get(0).getNomeFilme(), "Um filme chato");
    }

    @Test
    public void testeIndiretoNomesFuncionarios(){
        Assertions.assertEquals(filme1.getElenco().get(0).getNomeFuncionario(), funcionario1.getNomeFuncionario());
        Assertions.assertEquals(filme1.getElenco().get(1).getNomeFuncionario(), funcionario2.getNomeFuncionario());
        Assertions.assertEquals(filme1.getElenco().get(2).getNomeFuncionario(), funcionario3.getNomeFuncionario());
        Assertions.assertEquals(filme2.getElenco().get(0).getIdFuncionario(), funcionario3.getIdFuncionario());
    }

    @Test
    public void testeIndiretoNomesFilmes(){
        Assertions.assertEquals(filme1.getElenco().get(0).getFilmografia().get(0).getNomeFilme(), filme1.getNomeFilme());
        Assertions.assertEquals(filme1.getElenco().get(1).getFilmografia().get(0).getNomeFilme(), filme1.getNomeFilme());
        Assertions.assertEquals(filme1.getElenco().get(2).getFilmografia().get(0).getNomeFilme(), filme1.getNomeFilme());
        Assertions.assertEquals(filme2.getElenco().get(0).getFilmografia().get(1).getNomeFilme(), filme2.getNomeFilme());
    }

    @Test
    public void testeFuncoesDosFuncionarios(){
        Assertions.assertEquals(funcionario1.getFuncoes().get(0), "Diretor");
        Assertions.assertEquals(funcionario1.getFuncoes().get(1), "Roteirista");
        Assertions.assertEquals(funcionario2.getFuncoes().get(0), "Ator");
        Assertions.assertEquals(funcionario3.getFuncoes().get(0), "Ator");
        Assertions.assertEquals(funcionario3.getFuncoes().get(1), "Roteirista");
    }

    @Test
    public void testeTrilhaSonora(){
        Assertions.assertEquals(filme1.getTrilhaSonora().get(0), "Soundtrack #1");
        Assertions.assertEquals(filme1.getTrilhaSonora().get(1), "Soundtrack #2");
        Assertions.assertEquals(filme2.getTrilhaSonora().get(0), "Soundtrack #3");
        Assertions.assertEquals(filme2.getTrilhaSonora().get(1), "Soundtrack #4");
        
    }

    @Test
    public void testeIndiretoAnosDosFilmes(){
        Assertions.assertEquals(funcionario1.getFilmografia().get(0).getAnoFilme(), 2023);
        Assertions.assertEquals(funcionario2.getFilmografia().get(0).getAnoFilme(), 2023);
        Assertions.assertEquals(funcionario3.getFilmografia().get(0).getAnoFilme(), 2023);
        Assertions.assertEquals(funcionario3.getFilmografia().get(1).getAnoFilme(), 2010);
    }

    @Test
    public void testeSuperIndireto(){
        Assertions.assertEquals(funcionario1.getFilmografia().get(0).getElenco().get(0).getFilmografia().get(0).getTrilhaSonora(), filme1.getTrilhaSonora());
        Assertions.assertEquals(filme1.getElenco().get(2).getFilmografia().get(1).getNomeFilme(), filme2.getElenco().get(0).getFilmografia().get(1).getNomeFilme());
    }

}