package classes;
import java.util.List;
import java.util.ArrayList;

public class Disciplina {

    private String nomeDisc;
    private Professor professorDisc;
    private List<Aluno> alunosDisc;

    public Disciplina(String nomeDisc) {
        this.nomeDisc = nomeDisc;
        alunosDisc = new ArrayList<>();
    }

    //Funções de Adição da Disciplina

    public void adicionarProfessorDisc(Professor professorNovo){
        professorDisc = professorNovo;
    }

    public void adicionarAlunoDisc(Aluno alunoNovo){
        alunosDisc.add(alunoNovo);
    }

    //Facilita o print
    public void exibirListaAlunos(){
        System.out.printf("[");
        for(Aluno a : alunosDisc){
            System.out.printf(a.getNomeAl() + ", ");
        }
        System.out.printf("]\n");
    }

    //Gets e sets
    public String getNomeDisc() {
        return nomeDisc;
    }
    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }
    public Professor getProfessorDisc() {
        return professorDisc;
    }
    public void setProfessorDisc(Professor professorDisc) {
        this.professorDisc = professorDisc;
    }
    public List<Aluno> getAlunosDisc() {
        return alunosDisc;
    }
    public void setAlunosDisc(List<Aluno> alunosDisc) {
        this.alunosDisc = alunosDisc;
    }

}