package Lab9;

public class HeapSort {

    /**
     * This method takes in an array on integers and sort them using heap-sort
     * @author Silas
     * @version 20231127
     *
     * @param input array of integer items
     * @return sorted array
     */
    //Silas Code
    public static int[] sort(int[]input)
    {
        //Initalize maxHeap
        MaxHeap maxHeap = new MaxHeap(input);
        //Create second array list to put values in
        //int[] temp = new[input.size];
        int[] temp = new int[input.length]; //changed declaration with size to length (Sweeney)
        /*
        iterate through temp and fill
        with maxHeap delete method which
        returns the maximum value each time

        !!(Sweeney) This didn't seem to work. MaxHeapMaker will do this, so I have changed the approach
        to just call the heapify method
         */
//        for(int i = temp.length-1; i >= 0; i--) {      //Sweeney - changed temp.size to temp.length
//
//            temp[i] = maxHeap.delete();
//        }

            temp = MaxHeapMaker.heapify(input);
        //return sorted array
        //return temp;
        return temp;//(Sweeney) changed to return the heapify results
    }
}
