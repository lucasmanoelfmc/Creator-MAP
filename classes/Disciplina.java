package classes;
//import java.util.Collection;
//import java.util.Vector;

public class Disciplina {
    private String nome;

    private Professor professores;
    private Aluno alunos;

    //private int idAlunos;
    //private int idProfessores;

    public Disciplina(String nome) {
        this.setNome(nome);
        //this.idAlunos = 0;
        //this.idProfessores = 0;

        //professores = new Vector<Professor>();
        //alunos = new Vector<Aluno>();
        professores = new Professor(nome, 0);
        alunos = new Aluno(nome, 0);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessores() {
        return professores;
    }
    public void setProfessores(Professor professores) {
        this.professores = professores;
    }

    public Aluno getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    /* 
    public void adicionarAluno(Aluno novoAluno){
        idAlunos++;
        alunos.add(novoAluno);
    }
    
    public void adicionarProfessor(Professor novoProfessor){
        idProfessores++;
        professores.add(novoProfessor);
    }
    */

    public void adicionarAluno(String nome, int matricula){
        //idAlunos++;
        alunos = new Aluno(nome, matricula);
    }

    public void adicionarProfessor(String nome, int matricula){
        //idProfessores++;
        professores = new Professor(nome, matricula);
    }

}
