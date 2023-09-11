import classes.ControleAcad;

public class controle {

    public static void main(String[] args) {

        System.out.println("\t*********TESTE*********");

        ControleAcad ca = new ControleAcad("SUAP");
        
        ca.adicionarDisciplina("Fisica III");

        ca.getDisciplinas().adicionarAluno("Jose", 123);
        ca.getDisciplinas().adicionarProfessor("Marcos", 1234);

        System.out.println("\tNome do Controle Academico: " + ca.getNome());
        System.out.println("\tNome da disciplina: " + ca.getDisciplinas().getNome());
        System.out.println("\tNome e matricula do aluno: " + ca.getDisciplinas().getAlunos().getNome() + "/" + ca.getDisciplinas().getAlunos().getMatricula());
        System.out.println("\tNome e matricula do professor: " + ca.getDisciplinas().getProfessores().getNome() + "/" + ca.getDisciplinas().getProfessores().getMatricula());   

    }
}
