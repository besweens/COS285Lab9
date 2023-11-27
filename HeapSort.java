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
        int[] temp = new[input.size];
        //iterate through temp and fill
        //with maxHeap delete method which
        //returns the maximum value each time
        for(int i = temp.size-1; i >= 0; i--)) {
            temp[i] = maxHeap.delete;      
        }
        
       //return sorted array
        return temp;
    }
}
