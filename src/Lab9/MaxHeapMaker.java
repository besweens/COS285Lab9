package Lab9;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxHeapMaker {
    /**
     * This method takes in an array of integers and returns a max-heap
     * It is more simple than it seemed in the 50 minutes of lab.
     * @param input array of integer values
     * @return input as a max-heap
     *
     * @author Sweeney
     * @version 20231127
     */
    public static int[]heapify(int[]input)
    {
        //int[]tempHeap = new int[input.length];
        int swap,parent=0;
        /*
        possibly,
        start rearranging in-place as in the linear time heap initialization
        left child is parent*2 + 1
        right child is parent *2 + 2
        parent is (child-1)/2

        */

        /*
        Given a set array, this loop forks from the end of the array and sorts the values
        into a "max heap" with "maximum results" (probably
         */
        for(int i = input.length-1; i>=0; i--){
            parent = (i-1)/2;
            if(input[i] > input[parent]) {
                swap = input[parent];
                input[parent] = input[i];
                input[i] = swap;
            }
        }
        //System.out.println(Arrays.toString(input));
        return input;
    }
}
