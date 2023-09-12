import classes.ControleAcad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Teste{

    private ControleAcad ca;

    @BeforeEach
    void setUp() throws Exception{
        ca = new ControleAcad();

        ca.adicionarDisciplina("Matematica Discreta");

        ca.adicionarProfessor("Antonio Carlos", 0);
        ca.vincularDisciplinaProfessor(ca.getDisciplinas().get(0), ca.getProfessores().get(0));

        ca.adicionarAluno("Lucas", 0);
        ca.vincularDisciplinaAluno(ca.getDisciplinas().get(0), ca.getAlunos().get(0));

        ca.adicionarDisciplina("MAP");
        ca.vincularDisciplinaAluno(ca.getDisciplinas().get(1), ca.getAlunos().get(0));
        
    }

    @Test 
    public void testeAluno(){
        Assertions.assertEquals(ca.getAlunos().get(0).getNomeAl(), "Lucas");
        Assertions.assertEquals(ca.getAlunos().get(0).getMatriculaAl(), 0);
    }

    @Test
    public void testeProfessor(){
        Assertions.assertEquals(ca.getProfessores().get(0).getNomeProf(), "Antonio Carlos");
        Assertions.assertEquals(ca.getProfessores().get(0).getMatriculaProf(), 0);
    }

    @Test
    public void testeDisciplinaMD(){
        Assertions.assertEquals(ca.getDisciplinas().get(0).getNomeDisc(), "Matematica Discreta");
        Assertions.assertEquals(ca.getDisciplinas().get(0).getProfessorDisc().getNomeProf(), "Antonio Carlos");
        Assertions.assertEquals(ca.getDisciplinas().get(0).getAlunosDisc().get(0).getNomeAl(), "Lucas");
    }

    @Test
    public void testeDisciplinaMAP(){
        Assertions.assertEquals(ca.getDisciplinas().get(1).getNomeDisc(), "MAP");
        Assertions.assertEquals(ca.getDisciplinas().get(1).getAlunosDisc().get(0).getNomeAl(), "Lucas");
    }


}