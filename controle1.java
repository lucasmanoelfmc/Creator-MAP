import classes.Aluno;
import classes.Disciplina;
import classes.Professor;
import classes.RDM;
import classes.ControleAcad;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;


public class controle1 {

    public static void main(String[] args) {

        ControleAcad ca1 = new ControleAcad("SUAP");
        //Collection<String> disciplinas = new Vector<String>();

        //disciplinas.add("Matematica Discreta");
        ca1.addNovaDisciplina("Matematica Discreta");

        Disciplina disciplina1 = new Disciplina(0, "Matematica Discreta");
        disciplina1.addNovoAluno("Joao", 111);
        Aluno aluno1 = new Aluno(0, "Joao", 111);
        
        disciplina1.addNovoProfessor("Antonio Carlos", 222);
        Professor professor1 = new Professor(0, "Antonio Carlos", 222);

        /* 
        System.out.println(ca1.getNome()  + ca1.getDisciplinas());
        System.out.println(disciplina1.getNome() + disciplina1.getAlunos() + disciplina1.getProfessores());
        System.out.println(aluno1.getNome() + aluno1.getMatricula());
        System.out.println(professor1.getNome() + professor1.getMatricula());
        */

        ControleAcad ca2 = new ControleAcad("Sistema da UEPB");
        ca2.addNovaDisciplina("Engenharia de Software 1");
        ca2.addNovaDisciplina("Calculo III");

        System.out.println(ca2.getDisciplinas().getNome());


        
    }
    
}
