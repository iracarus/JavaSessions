package JavaBasics;

import org.testng.annotations.Test;

public class LoopsConcepts {
    @Test
    public void loopsconcepts()
    {
        // for loop
        //        int sum = 0;
        //
        //	    for( int i =0; i <= 100; i++)
        //        {
        //            sum = sum+i;
        //        }
        //        System.out.println(sum);

        //        // while
        //        int num = 0;
        //        int sum = 0;
        //        boolean bool = true;
        //
        //        while(bool)
        //        {
        //            sum = sum+num;
        //            if(num == 5)
        //            {
        //                bool = false;
        //            }
        //            num++;
        //        }
        //        System.out.println(num);

        //        int num = 0;
        //
        //        do {
        //
        //        }while(true);
        //

        //        ArrayList<Integer> al = new ArrayList<>();
        //        al.add(100);
        //        al.add(200);
        //        al.add(300);
        //
        //        int[] arr = {100, 200, 300};
        //
        //        int sum = 0;
        //
        //        for( int i : arr)
        //        {
        //           sum = sum + i;
        //
        //           //i = 100;
        //            //        i = 200;
        //            //        i = 300;
        //
        //           // 1. sum = 0 + 100; = 100
        //            //  2. sum = 100 + 200; = 300
        //            // 3. sum = 300 + 300;  = 600
        //        }
        //        System.out.println(sum);

                // continue & break;


        for(int i=0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++) {
                if(j == 2)
                {
                    break;
                }
                System.out.println(i + "...." + j);
            }
            System.out.println("i am in first loop");
        }
    }
}
