package Arrays;

public class OrderedArray {
    private long[] array;
    private int nElems;

    public OrderedArray(int size)
    {
        array = new long[size];
        nElems = 0;
    }

    public int size()
    {
        return nElems;
    }

    public void display()
    {
        for(int i=0; i< nElems; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public void insert(long newItem)
    {
        array[nElems] = newItem;
        nElems++;
    }
    public int find(long searchKey)
    {
        int low = 0;
        int upper = nElems-1;
        int curIn;
        while(true)
        {
            curIn = (low+upper)/2;
            if(searchKey == array[curIn])
            {
                return curIn;
            }
            else if (low > upper)
            {
                return nElems;
            }
            else
            {
                upper = curIn;
            }
        }
    }

}
