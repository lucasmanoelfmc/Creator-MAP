package Lab8.testes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import Lab8.classes.MapToListAdapter;
import java.util.HashMap;

public class MapToListTeste {

    HashMap<Object, Object> mapa1;
    MapToListAdapter adaptadorMapa;

    @BeforeEach
    void setUp(){
        mapa1 = new HashMap<>();
        adaptadorMapa = new MapToListAdapter(mapa1);

        adaptadorMapa.add("X");
        adaptadorMapa.add("Y");
        adaptadorMapa.add("Z");
    }

    @Test
    public void testeGet(){
        Assertions.assertEquals("X", adaptadorMapa.get(0));
        Assertions.assertEquals("Y", adaptadorMapa.get(1));
        Assertions.assertEquals("Z", adaptadorMapa.get(2));
    }

    @Test
    public void testeAdd(){
        adaptadorMapa.add(1);
        adaptadorMapa.add(2);
        adaptadorMapa.add(3);
        Assertions.assertEquals(1, adaptadorMapa.get(3));
        Assertions.assertEquals(2, adaptadorMapa.get(4));
        Assertions.assertEquals(3, adaptadorMapa.get(5));
    }

    @Test
    public void testeClearEmpty(){
        adaptadorMapa.clear();
        Assertions.assertEquals(true, adaptadorMapa.isEmpty());
    }

    @Test
    public void testeRemoveAll(){
        adaptadorMapa.remove("X");
        adaptadorMapa.remove("Y");
        adaptadorMapa.remove("Z");
        Assertions.assertEquals(true, adaptadorMapa.isEmpty());
    }

    @Test
    public void testeSize(){
        Assertions.assertEquals(3, adaptadorMapa.size());
        adaptadorMapa.add(1);
        Assertions.assertEquals(4, adaptadorMapa.size());
        adaptadorMapa.add(2);
        Assertions.assertEquals(5, adaptadorMapa.size());
    }

    @Test
    public void testeToArray(){
        String[] arr = {"X", "Y", "Z"};
        Assertions.assertEquals(arr[0], adaptadorMapa.get(0));
        Assertions.assertEquals(arr[1], adaptadorMapa.get(1));
        Assertions.assertEquals(arr[2], adaptadorMapa.get(2));
    }
    
}