package JavaBasics;

import org.testng.annotations.Test;

public class DataTypes {

    @Test
    public void DataTypesDemo() {
        // 1. int
        int i = 8;

        // 2. byte
        byte b = (byte)130;
        System.out.println(b);
        // 3. short
        short sh = 543;

        // 4. double
        double d = 1234.546;

        // 5. float
        float f = 1235.334F;

        // 6. char
        char c1 = 'D';
        char c2 = 97;
        //System.out.println(c1);

        // 7. boolean
        boolean b1 = true; // false

        // 8. long
        long l = 5586868658677565L;

        long i2 = 2147483648L;



        // byte cannot hold anything beyond byte range, and if we try there we precision loss
        byte b4 = 10;
        byte b5 = 127;
        // byte b6 = 128; // incompatible types
        // byte b7 = (byte)128; output : -128
        // byte b8 = (byte)130; output : -126

        char c4 = (char)9765755767L;
        System.out.println(c4);

        char ch = 'a';
        ch++;
        System.out.println(ch);

        byte ay = 10;
        byte by = 20;
        byte cy = (byte)(ay+by);

        System.out.println(10/0);

    }
}
