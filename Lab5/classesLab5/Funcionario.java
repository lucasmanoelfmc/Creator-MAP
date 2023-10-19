package classesLab5;
import java.util.List;

import interfacesLab5.AtorIF;
import interfacesLab5.DiretorIF;
import interfacesLab5.RoteiristaIF;

import java.util.ArrayList;

public class Funcionario extends GloboFilmes implements AtorIF, DiretorIF, RoteiristaIF {
    
    private String nomeFuncionario;
    private int idFuncionario;
    private List<String> funcoes; //as funções de um funcionário (ator, diretor etc.)
    private List<Filme> filmografia; //filmes em que esse funcionário já trabalhou

    public Funcionario(String nomeFuncionario, int idFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.idFuncionario = idFuncionario;
        funcoes = new ArrayList<>();
        filmografia = new ArrayList<>();
    }

    //  Adicionar funções do funcionário
    public void adicionarFuncoes(String nomeFuncao){
        funcoes.add(nomeFuncao);
    }

    //  Adicionar filme na filmografia --> Vínculo
    void adicionarFilmografia(Filme filme){ // acesso apenas no pacote
        filmografia.add(filme);
    }

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
    public List<Filme> getFilmografia() {
        return filmografia;
    }
    public void setFilmografia(List<Filme> filmografia) {
        this.filmografia = filmografia;
    }

    //  Implements
    @Override
    public void atuar() {
        if(checarFuncoes("Ator") == true){
            System.out.println(this.nomeFuncionario + " está atuando!");
        }
        else{
            System.out.println(this.nomeFuncionario + " não foi contratado para atuar!");
        }
    }
    @Override
    public void dirigir() {
        if(checarFuncoes("Diretor") == true){
            System.out.println(this.nomeFuncionario + " está dirigindo um filme!");
        }
        else{
            System.out.println(this.nomeFuncionario + " não foi contratado para dirigir filmes!");
        }
    }
    @Override
    public void escrever() {
        if(checarFuncoes("Roteirista") == true){
            System.out.println(this.nomeFuncionario + " está escrevendo um roteiro!");
        }
        else{
            System.out.println(this.nomeFuncionario + " não foi contratado para escrever roteiros!");
        }
    }

    // Checar funções do funcionário
    private boolean checarFuncoes(String funcao){
        for(String runner : funcoes){
            if(funcao == runner){
                return true;
            }
        }
        return false;
    }

    //  String com a filmografia do funcionário
    public String exibirFilmografia(){
        int contador = 0;
        String listaFilmes = "[";
        for(Filme runner : filmografia){
            if(contador != filmografia.size() - 1){
                listaFilmes += runner.getNomeFilme() + ",\n";
            }
            else{
                listaFilmes += runner.getNomeFilme();
            }
            contador++;
        }
        listaFilmes += "]";
        return listaFilmes;
    }

    //  Print fácil das informações do funcionário
    public void fichaFuncionario(){
        System.out.println("****************************************");
        System.out.println("--- * --- FICHA DE FUNCIONÁRIO --- * ---");
        System.out.println("----------------------------------------");
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("ID do funcionário: " + idFuncionario);
        System.out.println("Funções exercidas: " + funcoes);
        System.out.println("Filmografia:\n" + exibirFilmografia());
        System.out.println("****************************************");
    }

}