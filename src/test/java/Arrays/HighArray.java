package Arrays;

public class HighArray {
    private long[] array;
    private int nElems;

    public HighArray(int size)
    {
        array = new long[size];
        nElems = 0;
    }

    public void insert(long item)
    {
        array[nElems] = item;
        nElems++;
    }

    public boolean find(long searchKey)
    {
        boolean foundKey = false;
        for(int i=0; i<nElems; i++)
        {
            if(array[i] == searchKey)
            {
                foundKey = true;
                break;
            }
        }

        return foundKey;
    }

    public void delete(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j] == searchKey) {
                nElems--;
                break;
            }
        }

        for (int k = j; k < nElems; k++) {
            array[k] = array[k + 1];
        }
    }

    public int showSize()
    {
        return nElems;
    }

    public void display()
    {
        for(int i=0; i<nElems; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
