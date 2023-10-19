package testesLab6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistemasLab6.Infraestrutura;

public class InfraestruturaTeste {

    Infraestrutura infraestrutura1;

    @BeforeEach
    void setUp() throws Exception{
        infraestrutura1 = new Infraestrutura();
    }
    
    @Test
    public void testeAlocacaoSalas(){
        Assertions.assertEquals(infraestrutura1.exibirAlocacaoSalas("CIAC").toString(),
        "Alocação das salas do CIAC:");
    }
    
}