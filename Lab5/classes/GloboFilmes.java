package classes;
import interfaces.VinculoIF;

public class GloboFilmes implements VinculoIF {

    //  Vinculação filme-funcionário <-- Implementação de VinculoIF
    @Override
    public void vincularFuncionarioFilme(Filme filme, Funcionario funcionario) {
        funcionario.adicionarFilmografia(filme);
        filme.adicionarElenco(funcionario);
    }

}
