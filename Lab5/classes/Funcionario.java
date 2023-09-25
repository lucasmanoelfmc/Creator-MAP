package classes;

import java.util.List;
import java.util.ArrayList;
import interfaces.AtorIF;
import interfaces.DiretorIF;
import interfaces.RoteiristaIF;

public class Funcionario implements AtorIF, DiretorIF, RoteiristaIF{
    
    private String nomeFuncionario;
    private int idFuncionario;
    private List<String> funcoes; //as funções de um funcionário (ator, diretor etc.)
    private List<Filme> filmografia; //filmes em que esse funcionário já trabalhou

    public Funcionario(String nomeFuncionario, int idFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.idFuncionario = idFuncionario;
        funcoes = new ArrayList<>();
    }

    //  Adicionar funções do funcionário
    public void adicionarFuncoes(String nomeFuncao){
        funcoes.add(nomeFuncao);
    }

    //  Adicionar filme na filmografia

    //  Vinculação funcionário-filme <-- Requer interface?

    //  Gets e sets
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public List<String> getFuncoes() {
        return funcoes;
    }
    public void setFuncoes(List<String> funcoes) {
        this.funcoes = funcoes;
    }

    //  Implements
    @Override
    public void atuar() {
        System.out.println(this.nomeFuncionario + " está atuando!");
    }
    @Override
    public void dirigir() {
        System.out.println(this.nomeFuncionario + " está dirigindo o filme!");   
    }
    @Override
    public void escrever() {
        System.out.println(this.nomeFuncionario + " está escrevendo o roteiro!");
    }

    //  toString()
    @Override
    public String toString() {
        return "Funcionario [nomeFuncionario=" + nomeFuncionario + ", idFuncionario=" + idFuncionario + ", funcoes="
                + funcoes + "]";
    }

}