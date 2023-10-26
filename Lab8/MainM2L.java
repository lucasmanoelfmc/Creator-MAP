package Lab8;
import java.util.HashMap;
import Lab8.classes.MapToListAdapter;

public class MainM2L {
    public static void main(String[] args) {

        // Utilizando Map como uma List
        HashMap<Object, Object> map1 = new HashMap<Object, Object>();
        MapToListAdapter M2L = new MapToListAdapter(map1);

        M2L.add("X");
        M2L.add("Y");

        System.out.println("M2L Output:");
        System.out.println(M2L.get(0)); 
        System.out.println(M2L.get(1)); 

        System.out.println("M2L contém 'X'? " + M2L.contains("X"));

        HashMap<Object, Object> map2 = new HashMap<Object, Object>();
        map2.put(0, "X");
        map2.put(1, "Y");

        System.out.println("M2L é igual ao map1? " + M2L.equals(map2));
        System.out.println("M2L está vazio? " + M2L.isEmpty());

        M2L.remove("X");
        System.out.println(M2L.get(0));
        M2L.add("X");

        for(int i = 0; i < M2L.size(); i++){
            System.out.println(M2L.toArray()[i]);
        }

        M2L.add("Z");

        System.out.println(map1.values());

        M2L.remove("X");
        System.out.println(map1.values());

    }
}