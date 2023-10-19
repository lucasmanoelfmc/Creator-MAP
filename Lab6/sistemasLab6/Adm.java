package sistemasLab6;

import java.util.ArrayList;

public class Adm {

    public StringBuilder listarReunioesAgendadas(ArrayList<String> reunioes){
        StringBuilder lista = new StringBuilder("");

        runner(reunioes, lista);

        return lista;
    }

    public StringBuilder listarEntrevistasAgendadas(ArrayList<String> entrevistas){
        StringBuilder lista = new StringBuilder("");

        runner(entrevistas, lista);

        return lista;
    }

    private static void runner(ArrayList<String> AL, StringBuilder lista){
        int contador = 0; 

        lista.append("[");
        
        for(String i : AL){
            if(contador < AL.size()-1){
                lista.append(i + ",\n");
            }
            else{
                lista.append(i + "]");
            }
            contador++;
        }

    }

}