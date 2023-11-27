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
        int[]tempHeap = new int[input.length];
        int swap=0;
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i=0; i< input.length;i++) {
            tempList.addLast(input[i]);
            if();
        }

//        for(int i=0; i< input.length;i++){
//            tempHeap[i]=input[i];
//            if (i>0){
//                for(int j=0; j< input.length;j++){
//                    if(tempHeap[i]>tempHeap[j]) {
//                        swap = tempHeap[i];
//                        tempHeap[i]=tempHeap[j];
//                        tempHeap[j]=swap;
//                    }
//                }
//        }
/*
insert parent
insert child at parentpos*2 , parentpos*2 + ;
 */
        return input;
    }
}
