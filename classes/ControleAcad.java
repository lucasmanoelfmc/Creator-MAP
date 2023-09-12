package classes;
import java.util.List;
import java.util.ArrayList;

public class ControleAcad {

    private List<Disciplina> disciplinas;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public ControleAcad() {
        disciplinas = new ArrayList<>();
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    //Funções de Adição do Controle Acadêmico

    public void adicionarDisciplina(String nomeDisc){
        disciplinas.add(new Disciplina(nomeDisc));
    }

    public void adicionarAluno(String nomeAl, int matriculaAl){
        alunos.add(new Aluno(nomeAl, matriculaAl));
    }

    public void adicionarProfessor(String nomeProf, int matriculaProf){
        professores.add(new Professor(nomeProf, matriculaProf));
    }


    //Funções de Vinculação

    public void vincularDisciplinaAluno(Disciplina disciplina, Aluno aluno){
        aluno.adicionarDisciplinaAl(disciplina);
        disciplina.adicionarAlunoDisc(aluno);
    }

    public void vincularDisciplinaProfessor(Disciplina disciplina, Professor professor){
        professor.adicionarDisciplinaProf(disciplina);
        disciplina.adicionarProfessorDisc(professor);
    }


    //Gets e sets
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    
}
