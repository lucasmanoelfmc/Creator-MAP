package classes;
import java.util.Collection;
import java.util.Vector;

public class Disciplina {
    private String nome;

    private Collection<Professor> professores;
    private Collection<Aluno> alunos;

    private int idProfessores;
    private int idAlunos;

    public Disciplina(String nome, Collection<Professor> professores, Collection<Aluno> alunos) {
        this.setNome(nome);
        
        this.idProfessores = 0;
        this.idAlunos = 0;

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


    public void addNovoProfessor(String nome, int matricula){
        idProfessores++;
        professores.add(new Professor(idProfessores, nome, matricula));
    }

    public void addNovoAluno(String nome, int matricula){
        idAlunos++;
        alunos.add(new Aluno(idAlunos, nome, matricula));
    }


}
