import classes.ControleAcad;

public class controle {

    public static void main(String[] args) {

        ControleAcad ca = new ControleAcad();

        ca.adicionarAluno("Lucas", 111);
        ca.adicionarAluno("Henio", 222);
        ca.adicionarAluno("Fernando", 333);

        System.out.println(ca.getAlunos().get(0).getNomeAl());
        System.out.println(ca.getAlunos().get(1).getMatriculaAl());

        ca.adicionarProfessor("Ramon", 0);

        ca.adicionarDisciplina("Estrutura de Dados");

        ca.vincularDisciplinaProfessor(ca.getDisciplinas().get(0), ca.getProfessores().get(0));

        System.out.println(ca.getDisciplinas().get(0).getProfessorDisc().getNomeProf());
        System.out.println(ca.getProfessores().get(0).getNomeProf());

        ca.getDisciplinas().get(0).adicionarAlunoDisc(ca.getAlunos().get(0));
        ca.getDisciplinas().get(0).adicionarAlunoDisc(ca.getAlunos().get(1));
        ca.getDisciplinas().get(0).adicionarAlunoDisc(ca.getAlunos().get(2));

        ca.getDisciplinas().get(0).exibirListaAlunos();

    }

}
