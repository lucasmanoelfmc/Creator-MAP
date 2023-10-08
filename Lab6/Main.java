//  Main (usuário) <-> fachada (SIG) <-> Subsistemas
//  Subsistemas são apenas simulações que retornam strings (para os testes unitários)
//  SIG: passar informação e só depois criar o subsistema

//  Descrição do Lab 6:
//  Implemente o SIG (sistema de informação geral) usado na UEPB
//  Ele compreende vários subsistemas responsáveis por atividades
//  relacionadas a setores específicos
//  A partir do SIG é possível obter informações:
//  i) Administrativas (reuniões agendadas com a diretoria, entrevistas);
//  ii) Financeiras (balanço de contas, folha de pagamento);
//  iii) Relacionadas aos professores (alocação por disciplina, tempo de casa);
//  iv) Relacionadas aos alunos (histórico e RDM);
//  v) Ao almoxarifado (estoque, pedido de compra);
//  vi) À infraestrutura (alocação de salas).

import facade.SIG;

public class Main {

    public static void main(String[] args) {

        SIG UEPB = new SIG();

        //  Facade do Adm
        UEPB.addReunioes("Reuniao dos diretores");
        UEPB.addReunioes("Reuniao dos alunos");
        UEPB.getReunioes(); 

        UEPB.addEntrevistas("Entrevista com a TV Itararé");
        UEPB.addEntrevistas("Entrevista para o Youtube");
        UEPB.getEntrevistas();

        //  Facade do Almoxarifado
        UEPB.addItem("Computador Accer", 1);
        UEPB.addItem("Impressora HP", 3);
        UEPB.getEstoque();
        UEPB.getPedidoCompra("Computador Accer");

        //  Facade do Aluno
        UEPB.addAluno("Vitor Silva", 89231);
        UEPB.getHistoricoAluno("Vitor Silva", 89231);
        UEPB.getRDMAluno("Vitor Silva", 89231);

        //  Facade do Financeiro
        UEPB.getBalancoContas();
        UEPB.getFolhaPagamento("Carlos Antônio");

        //  Facade da Infraestrutura
        UEPB.getAlocacaoSalas("CIAC");

        //  Facade do Professor
        UEPB.getAlocacaoDisciplina("Carlos Antônio");
        UEPB.getTempoCasaProfessor("Carlos Antônio");

    }
    
}