package Lab8;
import java.util.ArrayList;
import Lab8.classes.ListToMapAdapter;

public class MainL2M {
    public static void main(String[] args) {

        // Utilizando List como um Map
        ArrayList<Object> lista1 = new ArrayList<Object>();
        ListToMapAdapter L2M = new ListToMapAdapter(lista1);

        System.out.println("L2M está vazia? " + L2M.isEmpty());

        L2M.put(0, "A");
        L2M.put(1, "B");

        System.out.println("L2M Output:");
        System.out.println(L2M.get(0)); 
        System.out.println(L2M.get(1)); 
        System.out.println("L2M está vazia? " + L2M.isEmpty());

        System.out.println("Tamanho de L2M: " + L2M.size());

        ArrayList<Object> lista2 = new ArrayList<Object>();
        lista2.add("A");
        lista2.add("B");

        System.out.println("L2M é igual à lista? " + L2M.equals(lista2));
        System.out.println("L2M contém 'A'? " + L2M.containsValue("A"));

    }
}