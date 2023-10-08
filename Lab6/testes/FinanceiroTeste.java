package testes;
import sistemas.Financeiro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FinanceiroTeste {

    Financeiro financeiro1;
    
    @BeforeEach
    void setUp() throws Exception{
        financeiro1 = new Financeiro();
    }
    
    @Test
    public void testeBalancoContas(){
        Assertions.assertEquals(financeiro1.exibirBalancoContas().toString(),
        "Balanço de contas da UEPB:");
    }

    @Test
    public void testeFolhaPagamento(){
        Assertions.assertEquals(financeiro1.exibirFolhaPagamento("Luis").toString(),
        "Folha de pagamento do funcionario Luis:");
    }

}