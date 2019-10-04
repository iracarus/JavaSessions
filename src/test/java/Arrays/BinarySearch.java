package Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = new int[] {-7, 2 , 5, 16, 20};
        //System.out.println(binarySearchIterative(a, 16));
        //System.out.println(binarySearchIterative(a, -7));
        //System.out.println(binarySearchIterative(a, 11));

        System.out.println(binarySearchRecursive(a, 16));
        System.out.println(binarySearchRecursive(a, -7));
        System.out.println(binarySearchRecursive(a, 11));
    }
    public static int binarySearchIterative(int[] array, int searchValue)
    {

        int start = 0;
        int end = array.length;
        int mid;
        while(start < end)
        {
            mid = (start + end)/2;
            if(array[mid] == searchValue)
            {
                return mid;
            }
            else if(array[mid] > searchValue)
            {
                end = mid;
            }
            else if(array[mid] < searchValue)
            {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static  int binarySearchRecursive(int[] array, int searchValue)
    {
        return binarySearchRecursive(array, searchValue, 0, array.length-1);
    }
    public static int binarySearchRecursive(int[] array, int searchValue, int start, int end)
    {
        int mid = (start + end )/2;
        while(start < end)
        {
            if(array[mid] == searchValue)
            {
                return mid;
            }
            else if(searchValue < array[mid] )
            {
                return binarySearchRecursive(array, searchValue, start, mid);
            }
            else
            {
                return binarySearchRecursive(array, searchValue, mid+1, end);
            }
        }
        return -1;
    }


}

