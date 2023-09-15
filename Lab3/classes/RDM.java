package classes;

public class RDM {

    public void printRDM (Aluno alunoRegistro){
        System.out.println("**********************************");
        System.out.println("Registro de Matrícula");
        System.out.println("Aluno: " + alunoRegistro.getNomeAl());
        System.out.println("Matrícula: " + alunoRegistro.getMatriculaAl());
        System.out.println("Disciplinas do Aluno: ");
        System.out.printf("[");
        for(Disciplina a : alunoRegistro.getDisciplinasAl()){
            System.out.printf(a.getNomeDisc() + ", ");
        }
        System.out.printf("]\n");
        System.out.println("**********************************");
    }
    
}