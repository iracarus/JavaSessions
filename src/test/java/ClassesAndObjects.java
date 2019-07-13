import org.testng.annotations.Test;

public class ClassesAndObjects {
    @Test
    public void classesAndObjects()
    {
        // 1. Data hiding
        // 2. Abstraction
        // 3. Enacapsulation
        // 4. Tightly encapsulated class
        // 5. Is-A relationship
        // 6. Has-A relationship
        // 7. Method Signature
        // 8. Overloading
        // 9. Overriding
        // 10. Static Control Flow
        // 11. Instance Control Flow
        // 12. Consturctures
        // 13. Coupling
        // 14. Cohesion
        // 15. Type-Casting

//        Car c = new Car(2000);
//        Car d = new Car();
//
//        System.out.println(c.getPrice());
//        c.setProperties(5000);
//        System.out.println(c.getPrice());

        // static & instance variable
        // static is specific to a class ( not object specific )
        // instance is specific to objects ( and is different for each object )
//        c.wheels = 5;
//        c.price = 6000;
//
//        System.out.println(c.price);
//        d.setProperties(7000, "yellow", "audi");
//        System.out.println(d.getPrice());
//        System.out.println(d.getBrand());
//        System.out.println(d.getColor());

//
//        Car e = new Car();
//        System.out.println(e.getBrand());
//        System.out.println(e.getPrice());

        Car c = new Car();
        Car d = new Car();
        Car e = new Car();
        Car f = new Car();
        System.out.println("Objects created : " + Car.count);
        System.out.println("Count Isntance : " + c.countInstance);
        System.out.println("Count Isntance : " + d.countInstance);
        System.out.println("Count Isntance : " + e.countInstance);
    }

}
