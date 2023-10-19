package sistemasLab6;

public class Infraestrutura {

    public StringBuilder exibirAlocacaoSalas(String nomePredio){
        StringBuilder alocacao = new StringBuilder("Alocação das salas do ");
        return alocacao.append(nomePredio + ":");
    }
    
}