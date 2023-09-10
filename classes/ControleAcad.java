package classes;
import java.util.Collection;
import java.util.Vector;

public class ControleAcad {

    private String nome;
    private Collection<Disciplina> disciplinas;

    

    private int idDisciplinas;

    public ControleAcad(String nome) {
        this.setNome(nome);

        this.idDisciplinas = 0;

        disciplinas = new Vector<Disciplina>();

    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Collection<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addNovaDisciplina(String nome){
        idDisciplinas++;
        disciplinas.add(new Disciplina(idDisciplinas, nome));
    }

    @Override
    public String toString() {
        return "ControleAcad [nome=" + nome + ", disciplinas=" + disciplinas + ", idDisciplinas=" + idDisciplinas + "]";
    }
    
    
}
