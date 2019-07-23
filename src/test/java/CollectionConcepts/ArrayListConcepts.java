package CollectionConcepts;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcepts {
    @Test
    public void arrayListDemo()
    {
        ArrayList al = new ArrayList<>();

        // add
        int i = 10;
        al.add("Raj");
        al.add(10);
        al.add('a');
        al.add(20.0);
        al.add(i);

        // how to print
        System.out.println(al);

        // how to get total elements in ArrayList
        System.out.println(al.size());

        // traversing
        // Method 1 : using for each loop
        for(Object element : al)
        {
            System.out.println(element.getClass().getName());
        }

        // Method 2 : using for loop
        for(int x = 0; i< al.size(); i++)
        {
            System.out.println(al.get(x));
        }

        // Method 3 : using Iterator
        System.out.println("Using Iterator");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


        // addAll()
        ArrayList nl = new ArrayList();
        nl.add("Neha");
        nl.add(20);
        nl.add('b');

        System.out.println("al elements before adding nl : ");
        System.out.println(al);
        // al.addAll(nl);  add at end
        al.addAll(2, nl);

        System.out.println("al elements after adding nl : ");
        System.out.println(al);

        al.removeAll(nl);

        // output after removing nl object from al
        System.out.println("al elements after removing nl elements");
        System.out.println(al);
    }
}
