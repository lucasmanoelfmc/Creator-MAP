import facadeLab6.SIG;

public class MainLab6 {

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