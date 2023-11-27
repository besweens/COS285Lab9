package Lab9;
import java.io.IOException;
import java.util.Random;

/**
 * Running Example
 * Main class for the Lab 9 program
 *
 * creates an array of integers, passes it through
 * the sort method of HeapSort and prints the result
 * @author Ben Sweeney, Abby Pitcairn, Silas Qualls
 * @version 20231127
 */

public class RunningExample {
    public static void main(String[] args) throws IOException {
        //int[] testArray = [3,32,18,4,11,1,98,14,15,77];
        int[] testArrayOdd = new int[7];
        int[] testArrayEven = new int[8];
        Random rand = new Random();
        System.out.println(testArrayEven.length);
        for(int i=0; i<testArrayOdd.;i++){
            testArrayOdd[i]= rand.nextInt();
        }
        for(int i=0; i<testArrayEven.length;i++){
            testArrayOdd[i]= rand.nextInt();
        }
        //System.out.println("Test" + testArrayEven.toString() + " " + testArrayOdd.toString());
    }
}
