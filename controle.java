import classes.Aluno;
import classes.Disciplina;
import classes.Professor;
import classes.RDM;
import classes.ControleAcad;

public class controle {

    public static void main(String[] args) {

        System.out.println("\t*********TESTE*********");

        ControleAcad ca = new ControleAcad("SUAP");
        
        Disciplina disciplina1 = new Disciplina("Fisica III");
        ca.adicionarDisciplina(disciplina1);

        Aluno aluno1 = new Aluno("Jose", 123);
        disciplina1.adicionarAluno(aluno1);

        Professor professor1 = new Professor("Marcos", 1234);
        disciplina1.adicionarProfessor(professor1);

        System.out.println("\tNome do Controle Academico: " + ca.getNome());
        System.out.println("\tNome da disciplina1: " + disciplina1.getNome());
        System.out.println("\tNome e matricula do aluno1: " + aluno1.getNome() + "/" + aluno1.getMatricula());
        System.out.println("\tNome e matricula do professor1: " + professor1.getNome() + "/" + professor1.getMatricula());
        
        Disciplina disciplina2 = new Disciplina("Computacao Grafica");
        ca.adicionarDisciplina(disciplina2);
        Disciplina disciplina3 = new Disciplina("Matematica Discreta");
        ca.adicionarDisciplina(disciplina3);
        Disciplina disciplina4 = new Disciplina("Algebra Linear");
        ca.adicionarDisciplina(disciplina4);

    }
}
