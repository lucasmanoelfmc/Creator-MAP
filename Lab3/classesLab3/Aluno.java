package classesLab3;
import java.util.List;
import java.util.ArrayList;

public class Aluno {

    private String nomeAl;
    private int matriculaAl;
    private List<Disciplina> disciplinasAl;
    private RDM registro = new RDM(); //Opcao de design1: um aluno pode ter RDM mesmo sem ter disciplinas

    public Aluno(String nomeAl, int matriculaAl) {
        this.nomeAl = nomeAl;
        this.matriculaAl = matriculaAl;
        disciplinasAl = new ArrayList<>();
    }

    //Função de adicionar Disciplina ao Aluno

    public void adicionarDisciplinaAl(Disciplina disciplinaNova){
        disciplinasAl.add(disciplinaNova);
        //registro = new RDM();
        //Opcao de design2: um aluno só tem RDM quando se matricula em pelo menos uma disciplina
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
    public List<Disciplina> getDisciplinasAl() {
        return disciplinasAl;
    }
    public void setDisciplinasAl(List<Disciplina> disciplinasAl) {
        this.disciplinasAl = disciplinasAl;
    }
    public RDM getRegistro() {
        return registro;
    }
    public void setRegistro(RDM registro) {
        this.registro = registro;
    }
    
}