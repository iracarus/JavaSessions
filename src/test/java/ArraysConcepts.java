import org.testng.annotations.Test;

public class ArraysConcepts {
    @Test
    public void arraysConcepts()
    {
        int[] array = {23,24,56,43};
        String[] array1 = {"3243","ssdf","dtert","eertr", "123"};

        String[] strArray;
        strArray = new String[4];
//
//        strArray[0] = "sdfs";
//        strArray[2] = "abc";
//        strArray[3] = "23423";

//        for(String s : strArray)
//        {
//            //System.out.println(s);
//        }
        //System.out.println(strArray[1]);

        int[] array2;
        array2 = new int[5];
        array2[0] = 54;
        array2[1] = 65;
        array2[2] = 23;
        array2[3] = 102;
        array2[4] = 2;
//
//        for(int i=0; i < array2.length; i++)
//        {
//            System.out.println(array2[i]);
//        }
//
//        for( int k : array2)
//            System.out.println(k);



        System.out.println("****************");
        //java.util.Arrays.sort(array2);
        java.util.Arrays.sort(array2, 0, 2);

        //for (int i = 0; i< 5; i++)
        //System.out.println(array2[i]);


        //int[] array5;

        int[][] array2d;
        array2d = new int[2][2];
        array2d[0][0] = 23;
        array2d[0][1] = 43;
        array2d[1][0] = 332;
        array2d[1][1] = 65;

        for(int[] i : array2d)
        {
            for(int j : i)
            {
                System.out.println(i);
            }
        }
    }
}
