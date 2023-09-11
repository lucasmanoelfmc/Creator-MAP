package classes;
import java.util.Collection;
import java.util.Vector;

public class Disciplina {
    private String nome;

    private Collection<Professor> professores;
    private Collection<Aluno> alunos;

    private int idAlunos;
    private int idProfessores;

    public Disciplina(String nome) {
        this.setNome(nome);
        this.idAlunos = 0;
        this.idProfessores = 0;

        professores = new Vector<Professor>();
        alunos = new Vector<Aluno>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(Collection<Professor> professores) {
        this.professores = professores;
    }

    public Collection<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(Collection<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno novoAluno){
        idAlunos++;
        alunos.add(novoAluno);
    }
    
    public void adicionarProfessor(Professor novoProfessor){
        idProfessores++;
        professores.add(novoProfessor);
    }

}
