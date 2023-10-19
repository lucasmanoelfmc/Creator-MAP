package testesLab6;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistemasLab6.Adm;

public class AdmTeste {

    Adm adm1;
    ArrayList <String> reunioes;
    ArrayList <String> entrevistas;
    StringBuilder getter;

    @BeforeEach
    void setUp() throws Exception{

        adm1 = new Adm();

        getter = new StringBuilder("");

        reunioes = new ArrayList<>();
        reunioes.add("Reuniao1");
        reunioes.add("Reuniao2");

        entrevistas = new ArrayList<>();
        entrevistas.add("Entrevista1");
        entrevistas.add("Entrevista2");

    }
    
    @Test
    public void testeReunioes(){

        Assertions.assertEquals(adm1.listarReunioesAgendadas(reunioes).toString(),
        "[Reuniao1,\nReuniao2]");
        
    }

    @Test
    public void testeEntrevistas(){

        Assertions.assertEquals(adm1.listarEntrevistasAgendadas(entrevistas).toString(),
        "[Entrevista1,\nEntrevista2]");

    }

}