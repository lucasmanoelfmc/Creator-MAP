package classes;
import java.util.List;
import java.util.ArrayList;

public class Filme extends GloboFilmes {

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
    public void adicionarTrilhaSonora(String trackName){
        trilhaSonora.add(trackName);
    }

    //  Adicionar funcionário no elenco --> Vínculo
    void adicionarElenco(Funcionario funcionario){ // acesso apenas no pacote
        elenco.add(funcionario);
    }

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

    //  String com o elenco do filme
    public String exibirElenco(){
        int contador = 0;
        String listaFuncionarios = "[";
        for(Funcionario runner : elenco){
            if(contador != elenco.size() - 1){
                listaFuncionarios += runner.getNomeFuncionario() + ",\n";
            }
            else{
                listaFuncionarios += runner.getNomeFuncionario();
            }
            contador++;
        }
        listaFuncionarios += "]";
        return listaFuncionarios;
    }

    //  Print fácil das informações do filme
    public void fichaFilme(){
        System.out.println("****************************************");
        System.out.println("--- * --- FICHA DO FILME --- * ---");
        System.out.println("----------------------------------------");
        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Ano do filme: " + anoFilme);
        System.out.println("Trilha sonora: " + trilhaSonora);
        System.out.println("Elenco:\n" + exibirElenco());
        System.out.println("****************************************");
    }

}