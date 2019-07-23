package CollectionConcepts;

import org.testng.annotations.Test;

import java.util.*;

public class SetConcept {
    @Test
    public void hashSetConcepts()
    {
        // Set can only have unique values
        // Set does not maintain the insertion order
        // Null can be inserted once only
        // It implements HashTable algorithm
        Set<String> hs = new HashSet<>();
        hs.add("Raj");
        hs.add("Sachin");
        hs.add("Saurav");
        hs.add("Virat");

        System.out.println(hs);

        for (String s1 : hs)
        {
            //System.out.println(s1 + "..." + s1.hashCode());
        }

        System.out.println(hs.contains("Raj"));

    }

    @Test
    public void linkedHashSet()
    {
        // It implements LinkedList+HashTable
        // It only contains unique values
        // It does maintain the insertion order
        // It permits null value ( but we can store only null value )
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Raj");
        lhs.add("Sachin");
        lhs.add("Saurav");
        lhs.add("Virat");
        System.out.println(lhs.add(null));
        System.out.println(lhs.add(null));
        lhs.add("Raj");

        System.out.println(lhs);
    }

    @Test
    public void treeSet()
    {
        // If we want to store any object in a TreeSet
        // the corresponding class must be implementing Comparable interface
        // in the following example , String implements Comparable but StringBuffer does not
        Set<String> ts = new TreeSet<>();
        ts.add("Raj");
        ts.add("Sachin");
        ts.add("Zahir");
        ts.add("AVirat");

        System.out.println(ts);

        TreeSet nongenTs = new TreeSet();
        nongenTs.add(new StringBuffer("Raj"));
        nongenTs.add(new StringBuffer("Sachin"));
        nongenTs.add(new StringBuffer("Virat"));

        System.out.println(nongenTs);
    }
}
