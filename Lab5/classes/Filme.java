package classes;
import java.util.List;
import java.util.ArrayList;

//  informar todas as características de um dado filme (nome,
//  diretor, roteirista, elenco, trilha sonora, ano, etc.).

//  nome: String nomeFilme;
//  ano: int anoFilme;
//  elenco: lista de todos os funcionários
//  trilha sonora: List<String> trilhaSonora;
//  diretor, roteirista, atores: printar o nome de todos os funcionários que
//  estejam cadastrados com essas funções. ou seja, essas informações são obtidas do ELENCO

public class Filme {
    private String nomeFilme;
    private int anoFilme;
    private List<String> trilhaSonora;
    private List<Funcionario> elenco; //todos os funcionários que trabalharam no filme

    public Filme(String nomeFilme, int anoFilme) {
        this.nomeFilme = nomeFilme;
        this.anoFilme = anoFilme;
        trilhaSonora = new ArrayList<>();
        elenco = new ArrayList<>();
    }

    //  Adicionar trilhaSonora

    //  Adicionar funcionário no elenco

    //  Vinculação filme-funcionário <-- Requer interface?

    //  Gets e sets
    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public int getAnoFilme() {
        return anoFilme;
    }
    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }
    public List<String> getTrilhaSonora() {
        return trilhaSonora;
    }
    public void setTrilhaSonora(List<String> trilhaSonora) {
        this.trilhaSonora = trilhaSonora;
    }
    public List<Funcionario> getElenco() {
        return elenco;
    }
    public void setElenco(List<Funcionario> elenco) {
        this.elenco = elenco;
    }

    //  toString()
    @Override
    public String toString() {
        return "Filme [nomeFilme=" + nomeFilme + ", anoFilme=" + anoFilme + ", trilhaSonora=" + trilhaSonora
                + ", elenco=" + elenco + "]";
    }

}