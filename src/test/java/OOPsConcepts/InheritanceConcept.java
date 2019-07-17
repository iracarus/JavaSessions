package OOPsConcepts;

import OOPsConcepts.Child;

public class InheritanceConcept {
    public static void main(String[] args) {
//        // Reference Child - Object Child
//        System.out.println("Reference Child - Object Child");
//        Child c = new Child();
//        c.cash();
//        c.property();
//        c.marry();
//
//        // Reference Parent Type - Object Child type
//        // Top casting / Up casting
//        // Runtime Polymorphism - in this JVM decides at runtime which method will be called based on the object
// //     output
//        Reference Parent Type - Object Child type
//        2000
//        2 houses
//        Marry Arnold
        // in case some variable or method is static in parent class then in child class Overriding does not
        // come into picture
        // This concept is called - Method Hiding ( not Method overriding )
        System.out.println("Reference Parent Type - Object Child type");
        Parent p = new Child();
        p.cash();
        p.property();
        p.marry();
//
//        // Reference Parent Type - Object Parent Type
//        System.out.println("Reference Parent Type - Object Parent Type");
//        Parent p1 = new Parent();
//        p1.cash();
//        p1.property();
//        p1.marry();

        // Child Reference - Parent Object
        // Downcasting - we are trying to fit in a larger thing into a smaller thing, which might cause issues
        // Child c1 = (Child)new Parent(); -- ClassCastException : PArent cannot be cast to child
//
//        ChildsChild cc = new ChildsChild();
//        cc.cash();
//        cc.property();
//        cc.marry();

        // Access Modifier cannot be higher security , but cannot be lower in child classes
    }
}
