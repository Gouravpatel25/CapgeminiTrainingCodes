package collectionsHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(0, 200);
        map.put(null, null);
        map.put(25, 300);
        
        Set<Map.Entry<Integer,Integer>> entry_set =map.entrySet();
        for(Map.Entry<Integer,Integer> entry:entry_set) {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
    } 
}
