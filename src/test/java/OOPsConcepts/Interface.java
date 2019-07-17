package OOPsConcepts;

// Interface Definition :
// Any service requirement sepcification or any contract betwwen client and service provider are 100% pure abstract
// class is nothing but interface.
// Properties :
// 1. No method implementation ( only declaration )
// 2. methods public and abstract by default
// 3. All the variable in an Interface are always Public, Static And Final by default.
// 4. We cannot create an object of Interface
// 5. In case of Abstract Classes we need to implement only Abstract methods, but in case of Interfaces we must
//    implement all the methods from interface

public interface Interface {
    void m1();
    void m2();
    //void m3();
    int i = 10;
}

class InterfaceImplementation implements Interface
{
    public void m1()
    {
        System.out.println("m1 implementation");
    }

    public void m2()
    {
        System.out.println("m2 implementation");
    }
}


class TestInterface
{
    public static void main(String[] args) {

        Interface interf = new InterfaceImplementation(); // 1. WebDriver driver = new ChromeDriver();
        InterfaceImplementation inf = new InterfaceImplementation(); // 2. ChromeDriver driver = new ChromeDriver();
    }
}