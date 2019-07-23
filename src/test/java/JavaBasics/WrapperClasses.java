package JavaBasics;

public class WrapperClasses {
    // Wrapper : A Wrapper class is a class whose object wraps or contains a primitive data types.
    // When we create an object to a wrapper class, it contains a field and in this field,
    // we can store a primitive data types. In other words, we can wrap a primitive value into a wrapper class object.
    enum Subjects
    {
        Maths, English, Hindi;
    }

    public static void main(String[] args) {
        int i = 10;
        long l = (long)i;
        Integer wI = new Integer(10);

        System.out.println(i);
        System.out.println(wI);

        Double d = 10.0;
        Integer newI = d.intValue();

        // toString()
        // parseXXX()
        // valueOf
        // xxxValue()

        // wrapper value --> primitive ( xxxValue() )   // Autounboxing
        Integer wI2 = new Integer(20);
        // int i2 = wI2.intValue();

        int i3 = wI2;

        // primitive --> wrapper  ( valueOf() )  // Autoboxing
        int i4 = 10;
        Integer wI3 = Integer.valueOf(i3);
        Integer wI4 = i3;

        // wrapper --> string ( toString() )
        Double d2 = new Double(10.0);
        String s1 = d.toString();

        // String --> wrapper ( valueOf () )
        String s2 = "Price : 10.00";
        String s3 = s2.replace("Price : ", "");
        System.out.println(s3);

        Double d3 = Double.valueOf(s3);

        if( d3 > 5.0)
        {
            System.out.println("price is more than 5.0");
        }

        // String --> primitive ( parseXXX() )
//        String s2 = "Price : 10.00";
//        String s3 = s2.replace("Price : ", "");
//        System.out.println(s3);

        // double d3 = s3


        // primitive --> string ( toString() )
//        long l2 = 10L;
//        System.out.println(l2.);

    }

}
