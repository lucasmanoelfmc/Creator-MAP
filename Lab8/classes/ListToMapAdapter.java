package Lab8.classes;
import java.util.*;
import Lab8.interfaces.MapIF;

public class ListToMapAdapter implements MapIF {
    private List<Object> list = new ArrayList<Object>();

    
    public ListToMapAdapter(List<Object> list) {
        this.list = list;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        return false;   //  list não possui keys
    }

    @Override
    public boolean containsValue(Object value) {
        return list.contains(value);
    }

    @Override
    public boolean equals(Object obj) {
        return list.equals(obj);
    }

    @Override
    public Object get(int key) {
        return list.get(key);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void put(int key, Object value) {
        list.add(key, value);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public List<Object> values() {
        return Arrays.asList(list.toArray());
    }

}