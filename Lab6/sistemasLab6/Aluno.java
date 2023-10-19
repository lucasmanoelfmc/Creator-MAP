package sistemasLab6;

import java.util.ArrayList;

import exceptionsLab6.alunoInexistenteException;

public class Aluno {

    public StringBuilder exibirHistorico(String nomeAluno, int matriculaAluno, ArrayList<Integer> matriculas){
        StringBuilder historico = new StringBuilder("");

        for(Integer i : matriculas){
            if(i == matriculaAluno){
                return historico.append(nomeAluno);
            }
        }

        throw new alunoInexistenteException("O aluno " + nomeAluno + " não está matriculado");
        
    }

    public StringBuilder exibirRDM(String nomeAluno, int matriculaAluno, ArrayList<Integer> matriculas){
        StringBuilder RDM = new StringBuilder("");

        for(Integer i : matriculas){
            if(i == matriculaAluno){
                return RDM.append(nomeAluno);
            }
        }

        throw new alunoInexistenteException("O aluno " + nomeAluno + " não está matriculado");
    }
    
}