package CollectionConcepts;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {
    @Test
    public void linkedListDemo()
    {
        LinkedList ll = new LinkedList<>();
        ll.add("Raj");
        ll.add(10);
        ll.add('R');
        ll.add(10.0);



        System.out.println(ll);

        ll.addFirst("Neha");

        System.out.println(ll);

        ll.addLast(35);

        System.out.println(ll);
        ll.add(1, "Add New");

        System.out.println(ll);
        ll.set(1, "SetNew");

        System.out.println(ll);
    }
}
