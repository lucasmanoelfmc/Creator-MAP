package Lab8.interfaces;
import java.util.Collection;

public interface MapIF {
    void clear();
    boolean containsKey(Object key);
    boolean containsValue(Object value);
    boolean equals(Object obj);
    Object get(int key);
    boolean isEmpty();
    void put(int key, Object value);
    void remove(Object obj);
    int size();
    Collection<Object> values();
}