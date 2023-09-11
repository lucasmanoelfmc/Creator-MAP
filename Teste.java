import classes.ControleAcad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Teste {

    private ControleAcad ca1;
    
    
    @BeforeEach
    void setUp() throws Exception{

        //SUAP -> Redes de Computadores

        ca1 = new ControleAcad("SUAP");

        //disciplina1 = new Disciplina("Redes de Computadores");
        //ca1.adicionarDisciplina(disciplina1);

        ca1.adicionarDisciplina("Redes de Computadores");

        //Redes de Computadores -> Lucas (Aluno) e Mateus (Professor)
        
        ca1.getDisciplinas().adicionarAluno("Lucas", 111);
        ca1.getDisciplinas().adicionarAluno("Mateus", 1111);

    }

    @Test //Testes verdadeiros
    public void testeControleAcad(){
        //Controle Academico1
        Assertions.assertEquals(ca1.getNome(), "SUAP");
    }

    @Test //Testes verdadeiros
    public void testeDisciplinas(){
        //Disciplina1
        Assertions.assertEquals(ca1.getDisciplinas().getNome(), "Redes de Computadores");
    }

    @Test //Testes verdadeiros
    public void testeAlunos(){ 
        //Aluno1
        Assertions.assertEquals(ca1.getDisciplinas().getAlunos().getNome(), "Lucas");
        Assertions.assertEquals(ca1.getDisciplinas().getAlunos().getMatricula(), 111);
    }

    @Test //Testes verdadeiros
    public void testeProfessores(){ 
        //Professor1
        Assertions.assertEquals(ca1.getDisciplinas().getProfessores().getNome(), "Mateus");
        Assertions.assertEquals(ca1.getDisciplinas().getProfessores().getMatricula(), 1111);
    }
    
}
