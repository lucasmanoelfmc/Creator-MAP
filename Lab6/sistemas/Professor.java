package sistemas;

public class Professor {

    public String exibirAlocacaoDisciplina(){
        String alocacao = "Alocação por Disciplina";

        return alocacao;
    }

    public String exibirTempoCasa(String nomeProfessor){
        String tempoCasa = "Tempo de Casa do Professor ";
        tempoCasa += nomeProfessor;
        return tempoCasa;
    }
    
}
