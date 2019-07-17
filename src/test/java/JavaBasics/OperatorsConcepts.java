package JavaBasics;

import org.testng.annotations.Test;

public class OperatorsConcepts {
    @Test
    public void arithmeticOperators()
    {
        // System.out.println(10/0); RE : ArithmeticException : / by zero
        System.out.println(10/0.0); // Infinity
        // System.out.println(0/0); RE : ArithmeticException : / by zero
        System.out.println(0.0/0); // NaN
        System.out.println(-0.0/0); // it's still NaN , not -NaN

        /*
        Infinity : float & double classes contains two constants
        - POSITIVE_INFINITY
        - NEGATIVE_INFINITY
         */
        System.out.println(10/0.0); // Infinity
        System.out.println(-10/0.0); // -Infinity

        /*
        NaN : Float & Double classes contains NaN constant
         */
        System.out.println(0.0/0);

        /*
        Artithmetic Exceptions :
        - It is runtime exception but not compile time error
        - It occurs only in integral arithmetic but not in floating point arithmetic
        - the only operators which cause arithmetic exception are / & %
         */
    }

    @Test
    public void relationalOperators()
    {
        System.out.println( 10 < 20 ); // true
        System.out.println('a' < 10 ); // false
        System.out.println('a' < 97.6); // true
        System.out.println('a' < 'A'); // true
        //System.out.println( true > false); Error:(41, 34) java: bad operand types for binary operator '>'
                                          // first type:  boolean
                                          // second type: boolean

        int[] a;

    }
}
