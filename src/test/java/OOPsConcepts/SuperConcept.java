package OOPsConcepts;

// this() - it is the method which is used for calling a constructor of the same class
// super() - it is the method which is used for calling a constructor of the parent class
// this() & super() these can only the first statements in any constructor
// this() & super() cannot exist simultenously.

public class SuperConcept {
    public SuperConcept()
    {
        System.out.println("Super Concept Default Constructor");
    }

    public SuperConcept(int i)
    {
        System.out.println("Super Concept Int Constructor");
    }
}

class ChildClass extends SuperConcept
{
    public ChildClass()
         {
             super(10);
             System.out.println("Child Class Default Constructor.");
         }

         public ChildClass(int i)
         {
             super();
             System.out.println("Child Class int Constructor.");
         }
}

class TestSuper
{
    public static void main(String[] args) {
        //ChildClass cc1 = new ChildClass(10);
        ChildClass cc2 = new ChildClass();
        // Super Concept Int Constructor
        // Child Class Default Constructor.


    }
}