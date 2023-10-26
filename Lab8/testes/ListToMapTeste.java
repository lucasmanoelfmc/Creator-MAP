package Lab8.testes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import Lab8.classes.ListToMapAdapter;
import java.util.ArrayList;
import java.util.List;

public class ListToMapTeste {

    ArrayList<Object> lista1;
    ListToMapAdapter adaptadorLista;

    @BeforeEach
    void setUp(){
        lista1 = new ArrayList<>();
        adaptadorLista = new ListToMapAdapter(lista1);

        adaptadorLista.put(0, "A");
        adaptadorLista.put(1, "B");
        adaptadorLista.put(2, "C");
    }

    @Test
    public void testeGet(){
        Assertions.assertEquals("A", adaptadorLista.get(0));
        Assertions.assertEquals("B", adaptadorLista.get(1));
        Assertions.assertEquals("C", adaptadorLista.get(2));
    }

    @Test
    public void testePut(){
        adaptadorLista.put(3, "D");
        adaptadorLista.put(4, "E");
        adaptadorLista.put(5, "F");
        Assertions.assertEquals("D", adaptadorLista.get(3));
        Assertions.assertEquals("E", adaptadorLista.get(4));
        Assertions.assertEquals("F", adaptadorLista.get(5));
    }

    @Test
    public void testeClearEmpty(){
        adaptadorLista.clear();
        Assertions.assertEquals(true, adaptadorLista.isEmpty());
    }

    @Test
    public void testeContainsKey(){
        Assertions.assertEquals(false, adaptadorLista.containsKey(0));
    }

    @Test
    public void testeContainsValue(){
        Assertions.assertEquals(true, adaptadorLista.containsValue("A"));
        Assertions.assertEquals(true, adaptadorLista.containsValue("B"));
        Assertions.assertEquals(true, adaptadorLista.containsValue("C"));
    }

    @Test
    public void testeEquals(){
        ArrayList<Object> listaTeste = new ArrayList<>();
        listaTeste.add("A");
        listaTeste.add("B");
        listaTeste.add("C");
        Assertions.assertEquals(true, listaTeste.equals(listaTeste));
    }

    @Test
    public void testeRemove(){
        adaptadorLista.remove("A");
        adaptadorLista.remove("B");
        adaptadorLista.remove("C");
        Assertions.assertEquals(true, adaptadorLista.isEmpty());
    }

    @Test
    public void testeSize(){
        Assertions.assertEquals(3, adaptadorLista.size());
        adaptadorLista.put(3, "D");
        Assertions.assertEquals(4, adaptadorLista.size());
        adaptadorLista.put(4, "E");
        Assertions.assertEquals(5, adaptadorLista.size());
    }

    @Test
    public void testeValues(){
        List<Object> listaTeste = new ArrayList<Object>();
        listaTeste = adaptadorLista.values();
        Assertions.assertEquals(true, adaptadorLista.equals(listaTeste));
    }
    
}