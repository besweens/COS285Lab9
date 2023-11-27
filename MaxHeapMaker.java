package Lab9;

import java.util.ArrayList;
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
        //int[]tempHeap = new int[input.length];
        int swap,parent=0;

       // ArrayList<Integer> tempList = new ArrayList<>();
/*
possibly,
start rearranging in-place as in the linear time heap initialization
left child is parent*2 + 1
right child is parent *2 + 2
parent is (child-1)/2

 */

        parent = (input[input.length]-1)/2;
        return input;
    }
}
