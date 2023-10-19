package sistemasLab6;

import java.util.ArrayList;

import exceptionsLab6.itemInexistenteException;

public class Almoxarifado {

    public StringBuilder exibirEstoque(ArrayList<String> itens, ArrayList<Integer> quantidades){
        StringBuilder lista = new StringBuilder("");

        runner(itens, quantidades, lista);

        return lista;
    }

    public StringBuilder exibirPedidoCompra(String item, ArrayList<String> itens){
        StringBuilder pedidoCompra = new StringBuilder("");

        for(String i : itens){
            if(i == item){
                return pedidoCompra.append(item);
            }
        }

        throw new itemInexistenteException("O item " + item + " não está registrado no sistema");
        
    }

    private static void runner(ArrayList<String> itens, ArrayList<Integer> quantidades, 
                                StringBuilder lista){

        lista.append("[");

        for(int i = 0; i < itens.size(); i++){
            if(i < itens.size()-1){
                lista.append(itens.get(i) + " x" + quantidades.get(i) + ",\n");
            }
            else{
                lista.append(itens.get(i) + " x" + quantidades.get(i) + "]");
            }
        }
        
    }
    
}
