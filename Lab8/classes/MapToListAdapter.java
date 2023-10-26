package Lab8.classes;
import java.util.*;
import Lab8.interfaces.ListIF;

public class MapToListAdapter implements ListIF {
    private Map<Object, Object> map = new HashMap<Object, Object>();
    int i = 0;
    
    public MapToListAdapter(Map<Object, Object> map) {
        this.map = map;
    }

    @Override
    public void add(Object value) {
        map.put(i, value);
        i++;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object obj) {
        return map.containsValue(obj);
    }

    @Override
    public boolean equals(Object obj) {
        return map.equals(obj);
    }

    @Override
    public Object get(int index) {
        return map.get(index);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Iterator<Object> iterator() {
        return map.values().iterator();
    }

    @Override
    public void remove(Object obj) {
        map.values().remove(obj);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Object[] toArray() {
        return map.values().toArray();
    }
  
}