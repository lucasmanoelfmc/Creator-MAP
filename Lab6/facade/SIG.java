package facade;
import sistemas.*;

public class SIG {

    Adm admnistrativo;
    Almoxarifado almoxarifado;
    Aluno aluno;
    Financeiro financeiro;
    Infraestrutura infraestrutura;
    Professor professor;

    public SIG() {
        admnistrativo = new Adm();
        almoxarifado = new Almoxarifado();
        aluno = new Aluno();
        financeiro = new Financeiro();
        infraestrutura = new Infraestrutura();
        professor = new Professor();
    }

    //Facade for Adm
    public void reunioesAgendadas(){
        System.out.println(admnistrativo.listarEntrevistasAgendadas());
    }

    public void entrevistasAgendadas(){
        System.out.println(admnistrativo.listarReunioesAgendadas());
    }

    //Facade for Almoxarifado
    public void estoque(){
        System.out.println(almoxarifado.exibirEstoque());
    }

    public void pedidoCompra(){
        System.out.println(almoxarifado.exibirPedidoCompra());
    }

    //Facade for Aluno
    public void historicoAluno(){
        System.out.println(aluno.exibirHistorico());
    }

    public void RDMAluno(){
        System.out.println(aluno.exibirRDM());
    }

    //Facade for Financeiro
    public void balancoContas(){
        System.out.println(financeiro.exibirBalancoContas());
    }
    
    public void folhaPagamento(){
        System.out.println(financeiro.exibirFolhaPagamento());
    }

    //Facade for Infraestrutura
    public void alocacaoSalas(){
        System.out.println(infraestrutura.exibirAlocacaoSalas());
    }

    //Facade for Professor
    public void alocacaoDisciplina(){
        System.out.println(professor.exibirAlocacaoDisciplina());
    }

    public void tempoCasaProfessor(String nomeProfessor){
        System.out.println(professor.exibirTempoCasa(nomeProfessor));
    }
    
}