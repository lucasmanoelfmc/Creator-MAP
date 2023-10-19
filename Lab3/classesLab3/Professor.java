package classesLab3;
import java.util.List;
import java.util.ArrayList;

public class Professor {

    private String nomeProf;
    private int matriculaProf;
    private List<Disciplina> disciplinasProf;

    public Professor(String nomeProf, int matriculaProf) {
        this.nomeProf = nomeProf;
        this.matriculaProf = matriculaProf;
        disciplinasProf = new ArrayList<>();
    }

    public void adicionarDisciplinaProf(Disciplina disciplina){
        disciplinasProf.add(disciplina);
    }


    //Gets e sets
    public String getNomeProf() {
        return nomeProf;
    }
    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }
    public int getMatriculaProf() {
        return matriculaProf;
    }
    public void setMatriculaProf(int matriculaProf) {
        this.matriculaProf = matriculaProf;
    }
    public List<Disciplina> getDisciplinasProf() {
        return disciplinasProf;
    }
    public void setDisciplinasProf(List<Disciplina> disciplinasProf) {
        this.disciplinasProf = disciplinasProf;
    }
    
}