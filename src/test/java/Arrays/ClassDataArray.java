package Arrays;

public class ClassDataArray {
    private Person[] array;
    private int nElems;

    public ClassDataArray(int size)
    {
        array = new Person[size];
        nElems = 0;
    }

    public void insert(String first, String last, int age)
    {
        array[nElems] = new Person(first, last, age);
        nElems++;
    }

    public Person find(String searchName)
    {
        for(int i = 0; i<nElems; i++)
        {
            if( array[i].getLastName().equals(searchName))
            {
                return array[i];
            }
        }

        return null;
    }

    public boolean delete(String searchName)
    {
        int j, k;
        for(j=0; j<nElems; j++)
        {
            if(array[j].getLastName().equals(searchName))
            {
                break;
            }
        }


        if(j == nElems)
        {
            return false;
        }
        else
        {
            for(k=j; k<nElems; k++)
            {
                array[k] = array[k+1];
            }

            array[k] = null;
            nElems--;
            return true;
        }
    }

    public void display()
    {
        for(int i=0; i<nElems; i++)
        {
            array[i].displayPerson();
        }
    }
}
