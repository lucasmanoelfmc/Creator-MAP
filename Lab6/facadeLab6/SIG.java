package facadeLab6;
import java.util.ArrayList;

import sistemasLab6.*;

public class SIG {

    private Adm admnistrativo;
    private Almoxarifado almoxarifado;
    private Aluno aluno;
    private Financeiro financeiro;
    private Infraestrutura infraestrutura;
    private Professor professor;

    private ArrayList <String> reunioes;
    private ArrayList <String> entrevistas;
    private ArrayList <String> itens;
    private ArrayList <Integer> quantidades;
    private ArrayList <Integer> matriculas;

    public SIG() {
        //Sistemas
        admnistrativo = new Adm();
        almoxarifado = new Almoxarifado();
        aluno = new Aluno();
        financeiro = new Financeiro();
        infraestrutura = new Infraestrutura();
        professor = new Professor();

        //Adm
        reunioes = new ArrayList<>();
        entrevistas = new ArrayList<>();

        //Almoxarifado
        itens = new ArrayList<>();
        quantidades = new ArrayList<>();

        //Aluno
        matriculas = new ArrayList<>();
    }

    //Facade do Adm
    public void getReunioes(){
        System.out.println("****************************");
        System.out.println("Lista de reuniões agendadas:");
        System.out.println(admnistrativo.listarReunioesAgendadas(reunioes));
    }

    public void addReunioes(String reuniao){
        reunioes.add(reuniao);
    }

    public void getEntrevistas(){
        System.out.println("****************************");
        System.out.println("Lista de entrevistas agendadas:");
        System.out.println(admnistrativo.listarEntrevistasAgendadas(entrevistas));
    }

    public void addEntrevistas(String entrevista){
        entrevistas.add(entrevista);
    }

    //Facade do Almoxarifado
    public void getEstoque(){
        System.out.println("****************************");
        System.out.println("Lista de itens no estoque:");
        System.out.println(almoxarifado.exibirEstoque(itens, quantidades));
    }
    
    public void addItem(String item, int quantidade){
        itens.add(item);
        quantidades.add(quantidade);
    }

    public void getPedidoCompra(String item){
        System.out.println("****************************");
        System.out.println("Pedido de Compra");
        System.out.println("Produto: " + almoxarifado.exibirPedidoCompra(item, itens));
    }

    //Facade do Aluno
    public void getHistoricoAluno(String nomeAluno, int matriculaAluno){
        System.out.println("****************************");
        System.out.println("Histórico do Aluno");
        System.out.println("Nome do aluno: " + aluno.exibirHistorico(nomeAluno, matriculaAluno, matriculas));
        System.out.println("Matrícula: " + matriculaAluno);
        System.out.println("Disciplinas e Notas:");
    }

    public void getRDMAluno(String nomeAluno, int matriculaAluno){
        System.out.println("****************************");
        System.out.println("Registro de Matrícula do Aluno");
        System.out.println("Nome do aluno: " + aluno.exibirRDM(nomeAluno, matriculaAluno, matriculas));
        System.out.println("Matrícula: " + matriculaAluno);
        System.out.printf("A Universidade Estadual da Paraíba confirma"); 
        System.out.printf(" que o aluno está devidamente matriculado\n");
    }

    public void addAluno(String nomeAluno, int matriculaAluno){
        matriculas.add(matriculaAluno);
    }

    //Facade do Financeiro
    public void getBalancoContas(){
        System.out.println("****************************");
        System.out.println(financeiro.exibirBalancoContas());
    }
    
    public void getFolhaPagamento(String nomeFuncionario){
        System.out.println("****************************");
        System.out.println(financeiro.exibirFolhaPagamento(nomeFuncionario));
    }

    //Facade da Infraestrutura
    public void getAlocacaoSalas(String nomePredio){
        System.out.println("****************************");
        System.out.println(infraestrutura.exibirAlocacaoSalas(nomePredio));
    }

    //Facade do Professor
    public void getAlocacaoDisciplina(String nomeProfessor){
        System.out.println("****************************");
        System.out.println(professor.exibirAlocacaoDisciplina(nomeProfessor));
    }

    public void getTempoCasaProfessor(String nomeProfessor){
        System.out.println("****************************");
        System.out.println(professor.exibirTempoCasa(nomeProfessor));
    }
    
}