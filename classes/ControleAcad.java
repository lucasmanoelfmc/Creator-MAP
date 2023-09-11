package classes;
//import java.util.Collection;
//import java.util.Vector;

public class ControleAcad {

    private String nome;
    private Disciplina disciplinas;

    //private int idDisciplinas;

    public ControleAcad(String nome) {
        this.setNome(nome);
        //this.idDisciplinas = 0;

        //disciplinas = new Vector<Disciplina>();
        disciplinas = new Disciplina(nome);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas = disciplinas;
    }


    /* 
    public void adicionarDisciplina(Disciplina novaDisciplina){
        idDisciplinas++;
        disciplinas.add(novaDisciplina);
    }
    */

    public void adicionarDisciplina(String nome){
        //idDisciplinas++;
        disciplinas = new Disciplina(nome);
    }
    
}
