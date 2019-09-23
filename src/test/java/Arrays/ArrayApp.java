package Arrays;

public class ArrayApp {
    public static void main(String[] args)
    {
        int[] array;
        array = new int[10];

        int nElems = 0;
        int searchKey;

        // insert the elements
        array[0] = 13;
        array[1] = 56;
        array[2] = 23;
        array[3] = 76;
        array[4] = 34;
        array[5] = 63;
        array[6] = 72;
        array[7] = 31;
        array[8] = 82;
        array[9] = 17;

        nElems = 10;

        // display all items
        for(int i=0; i<nElems; i++)
        {
            System.out.println(array[i]);
        }

        // find item with searchKey = 34
        searchKey = 34;
        boolean found = false;
        for(int i = 0; i<nElems; i++)
        {
            if(array[i] == searchKey)
            {
                System.out.println("Found key : " + searchKey + " at position : " + i);
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("Key not found.");

        // delete key with searchKey = 34
        int pos = 0;
        for(int i = 0; i<nElems; i++)
        {
            if(array[i] == searchKey)
            {
                array[i] = 0;
                pos = i;
                break;
            }
        }

        for(int j = pos; j<nElems-1; j++)
        {
            array[j] = array[j+1];
        }

        nElems = nElems-1;

        for (int i = 0; i< nElems; i++)
            System.out.println(array[i]);
    }
}
