package classes;
import java.util.List;
import java.util.ArrayList;

public class Aluno {

    private String nomeAl;
    private int matriculaAl;
    private List<Disciplina> disciplinasAl;

    public Aluno(String nomeAl, int matriculaAl) {
        this.nomeAl = nomeAl;
        this.matriculaAl = matriculaAl;
        disciplinasAl = new ArrayList<>();
    }

    //Função de adicionar Disciplina ao Aluno

    public void adicionarDisciplinaAl(Disciplina disciplinaNova){
        disciplinasAl.add(disciplinaNova);
    }


    //Gets e sets
    public String getNomeAl() {
        return nomeAl;
    }
    public void setNomeAl(String nomeAl) {
        this.nomeAl = nomeAl;
    }
    public int getMatriculaAl() {
        return matriculaAl;
    }
    public void setMatriculaAl(int matriculaAl) {
        this.matriculaAl = matriculaAl;
    }
    
}
