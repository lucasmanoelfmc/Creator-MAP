package testes;
import sistemas.Professor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfessorTeste {

    Professor professor1;

    @BeforeEach
    void setUp() throws Exception{
        professor1 = new Professor();
    }
    
    @Test
    public void testeAlocacaoDisciplina(){
        Assertions.assertEquals(professor1.exibirAlocacaoDisciplina("João").toString(),
        "Alocação das disciplinas do professor João:");
    }

    @Test
    public void testeTempoCasa(){
        Assertions.assertEquals(professor1.exibirTempoCasa("João").toString(),
        "Tempo de casa do professor João:");
    }
    
}