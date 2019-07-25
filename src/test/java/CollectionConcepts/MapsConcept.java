package CollectionConcepts;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapsConcept {
    @Test
    public void hashMapConcept()
    {
        // HashMap can contain Key, Value pairs
        // Hashmap can only contain unique value of Key, but values can be duplicate
        // HashMap objects are ordered on the basis of Key HashCode
        // Below is an example roll num, and name pair
        Map<Integer, String> hm = new HashMap<>();
        hm.put(101, "Sachin");
        hm.put(102, "Saurav");
        hm.put(100, "Virat");

        System.out.println(hm);

        // How to get the elements from a map
        System.out.println(hm.get(101));

        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();

        for(Map.Entry<Integer, String> e : entrySet )
        {
            System.out.println(e);
        }

        Set<Integer> keys = hm.keySet();
        for(Integer i : keys)
        {
            System.out.println(i + "-" + hm.get(i));
        }
    }

    @Test
    public void linkedHashMap()
    {
        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(101, "Sachin");
        lhm.put(100, "Saurav");
        lhm.put(102, "Virat");
        System.out.println(lhm);
    }
}
