package OOPsConcepts;

import javax.xml.bind.Element;
import java.util.LinkedList;
import java.util.List;

// Abstract Class : It is a class which does not have complete implementation
// We cannot create objects of an Abstract Class
public abstract class AbstractClass {
    public abstract void m1();
    void m2()
    {
        System.out.println("abstract class m2");
    }
}

class ConcreteClass extends AbstractClass{
    public void m1()
    {
        System.out.println("concrete class m1");
    }

    public void m3()
    {
        System.out.println("concrete class m3");
    }
}

class Test {
    public static void main(String[] args) {
        ConcreteClass cc = new ConcreteClass();
        cc.m1();
        cc.m2();
        cc.m3();

    }
}
