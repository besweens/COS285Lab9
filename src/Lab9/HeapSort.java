package Lab9;

public class HeapSort {
    
    /**
     * This method takes in an array on integers and sort them using heap-sort
     * @param input array of integer items
     * @return sorted array
     */
    //Silas Code
    public static int[] sort(int[]input)
    {
        //Initalize maxHeap
        MaxHeap maxHeap = new MaxHeap(input);
        //Create second array list to put values in
        //int[] temp = new[input.size]; change size to length (Sweeney)
        int[] temp = new int[input.length]; //changed declaration
        /*
        iterate through temp and fill
        with maxHeap delete method which
        returns the maximum value each time
         */
        for(int i = temp.length-1; i >= 0; i--) {      //Sweeney - changed temp.size to temp.length

            temp[i] = maxHeap.delete();
        }
        
       //return sorted array
        return temp;
    }
}
