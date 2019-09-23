package Arrays;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray lowArray;
        lowArray = new LowArray(13);
        int j; // loop counter
        int nElems = 0;
        long searchKey;

        // insert 10 elements
        lowArray.setElem(0, 345);
        lowArray.setElem(1, 523);
        lowArray.setElem(2, 712);
        lowArray.setElem(3, 142);
        lowArray.setElem(4, 623);
        lowArray.setElem(5, 17);
        lowArray.setElem(6, 752);
        lowArray.setElem(7, 913);
        lowArray.setElem(8, 372);
        lowArray.setElem(9, 81);

        nElems = 10;

        // display all elements
        for(j = 0; j<nElems; j++)
        {
            System.out.print( lowArray.getElem(j) + " ");
        }
        System.out.println();

        // search for key with value as 142
        searchKey = 142;
        for(j = 0; j<nElems; j++)
        {
            if(lowArray.getElem(j) == searchKey)
                break;
        }

        if(j == nElems)
            System.out.println("Could not find key : " + searchKey);
        else
            System.out.println("found key at pos : " + j);

        // delete searchKey with 17
        searchKey = 17;
        for(j = 0; j<nElems; j++)
        {
            if(lowArray.getElem(j) == searchKey)
                break;
        }

        for(int k = j; k<nElems-1; k++)
        {
            lowArray.setElem(k, lowArray.getElem(k+1));
        }
        nElems--;

        for(j=0; j< nElems; j++)
        {
            System.out.print(lowArray.getElem(j) + " ");
        }


    }
}
