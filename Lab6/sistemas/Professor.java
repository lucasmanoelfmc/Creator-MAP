package sistemas;

public class Professor {

    public StringBuilder exibirAlocacaoDisciplina(String nomeProfessor){
        StringBuilder alocacao = new StringBuilder("Alocação das disciplinas do professor ");
        return alocacao.append(nomeProfessor + ":");
    }

    public StringBuilder exibirTempoCasa(String nomeProfessor){
        StringBuilder tempoCasa = new StringBuilder("Tempo de casa do professor ");
        return tempoCasa.append(nomeProfessor + ":");
    }
    
}