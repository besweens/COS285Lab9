package Lab9;

import java.io.IOException;
import java.util.Arrays;
/**
 * This main class creates an array of integers,
 * passes it through the sort method of HeapSort and prints the result
 *
 * @author Sweeney
 * @version 20231127
 */
public class RunningExample {
    public static void main(String[] args) throws IOException {
        int[] testArray = {30,29,31,7,9,6,5,8};
        System.out.println("Initial array: " + Arrays.toString(testArray));
       // testArray=MaxHeapMaker.heapify(testArray);
      System.out.println("HeapSort Result: " + Arrays.toString(HeapSort.sort(testArray)));

    }
}
