package Lab8.interfaces;
import java.util.Iterator;

public interface ListIF {
    void add(Object value);
    void clear();
    boolean contains(Object obj);
    boolean equals(Object obj);
    Object get(int index);
    boolean isEmpty();
    Iterator<Object> iterator();
    void remove(Object obj);
    int size();
    Object[] toArray();
}