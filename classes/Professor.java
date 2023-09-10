package classes;

public class Professor {
    private int registroProfessor;
    private String nome;
    private int matricula;

    public Professor(int idProfessores, String nome, int matricula) {
        this.registroProfessor = idProfessores;
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
