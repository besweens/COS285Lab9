package Lab9;

import java.util.Arrays;

public class MaxHeapMaker {
    /**
     * This method takes in an array of integers and returns a max-heap 
     * @param input array of integer values
     * @return input as a max-heap
     *
     * @author Sweeney
     * @version 20231127
     */
    public static int[]heapify(int[]input)
    {
        int[]tempHeap = new int[input.length];
        int swap=0;
        // tempHeap[0]=input[0];
        for(int i=0; i< input.length;i++){
            tempHeap[i]=input[i];
            if (i>0){
                for(int j=0; j< input.length;j++){
                    if(tempHeap[i]>tempHeap[j]) {
                        swap = tempHeap[i];
                        tempHeap[i]=tempHeap[j];
                        tempHeap[j]=swap;
                    }
                }
        }

        //find max, first pos
        return input;
    }
}
