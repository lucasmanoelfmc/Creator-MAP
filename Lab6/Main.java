//  Main (usuário) <-> fachada (SIG) <-> Subsistemas
//  Subsistemas são apenas simulações que retornam strings (para os testes unitários)
//  SIG: passar informação e só depois criar o subsistema

//  Descrição do Lab 6:
//  Implemente o SIG (sistema de informação geral) usado na UEPB
//  Ele compreende vários subsistemas responsáveis por atividades
//  relacionadas a setores específicos
//  A partir do SIG é possível obter informações:
//  i) Administrativas (reuniões agendadas com a diretoria, entrevistas);
//  ii) Financeiras (balanço de contas, folha de pagamento);
//  iii) Relacionadas aos professores (alocação por disciplina, tempo de casa);
//  iv) Relacionadas aos alunos (histórico e RDM);
//  v) Ao almoxarifado (estoque, pedido de compra);
//  vi) À infraestrutura (alocação de salas).

import facade.SIG;

public class Main {

    public static void main(String[] args) {

        SIG sistema = new SIG();

        sistema.RDMAluno();
        
        sistema.balancoContas();

        sistema.alocacaoSalas();

        sistema.tempoCasaProfessor("Vitor");
        
    }
    
}