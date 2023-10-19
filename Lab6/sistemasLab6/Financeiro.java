package sistemasLab6;

public class Financeiro {

    public StringBuilder exibirBalancoContas(){
        StringBuilder balanco = new StringBuilder("Balanço de contas da UEPB:");
        return balanco;
    }

    public StringBuilder exibirFolhaPagamento(String nomeFuncionario){
        StringBuilder folha = new StringBuilder("Folha de pagamento do funcionario ");
        return folha.append(nomeFuncionario + ":");
    }
    
}