package testes;
import sistemas.Aluno;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTeste {

    Aluno aluno1;
    ArrayList <Integer> matriculas;

    @BeforeEach
    void setUp() throws Exception{
        aluno1 = new Aluno();
        matriculas = new ArrayList<>();
        matriculas.add(111);
    }
    
    @Test
    public void testeHistorico(){
        Assertions.assertEquals(aluno1.exibirHistorico("Marcos", 111,
        matriculas).toString(),
        "Marcos");
    }

    @Test
    public void testeRDM(){
        Assertions.assertEquals(aluno1.exibirRDM("Marcos", 111,
        matriculas).toString(),
        "Marcos");
    }
    
}