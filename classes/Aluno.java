package classes;

public class Aluno{
    private int registroAluno;
    private String nome;
    private int matricula;

    public Aluno(int idAlunos, String nome, int matricula) {
        this.registroAluno = idAlunos;
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
