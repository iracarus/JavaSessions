package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array;
        int i;
        array = new int[] {10,34,12,-15, 20};

        int searchKey = -14;

        for(i=0; i<array.length; i++)
        {
            if(searchKey == array[i])
                break;
        }

        if(i==array.length)
            System.out.println("element not found");
        else
            System.out.println("element found at : " + i);
    }
}
