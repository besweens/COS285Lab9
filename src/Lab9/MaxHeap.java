package Lab9;

public class MaxHeap {
    private int[] data;
    
    /**
     * @param data
     */
    public MaxHeap(int[]data)
    {
        this.setData(MaxHeapMaker.heapify(data));
    }
    
    /**
     * Remove the max value from the root of the tree while 
     * keeping the remaining the items as a max-heap
     * @author abigail pitcairn
     * @return max value
     */
    public int delete()
    {
        //store the max value
        int max = getData()[0];

        //find the new root and move it to the first spot
        int newRoot = getData()[getData().length-1];
        getData()[0] = newRoot;

        //declare a new array with size one less than starting data
        int[] newData = new int[getData().length-1];

        //copy over the data to the new resized array
        for (int i = 0; i < newData.length; ++i)
            newData[i] = getData()[i];

        //update the data to include the deletion
        setData(newData);

        //return the deleted value
        return max;
    }
    
    /**
     * Adds new item to the max-heap
     * @param newData the input value to be added to the max-heap
     * @author abigail pitcairn
     */
    public void add(int newData)
    {
        //declare a new array with size one more than starting data
        int[] newArray = new int[getData().length + 1];

        //copy over original data to resized array
        for (int i = 0; i < newArray.length; ++i)
            newArray[i] = getData()[i];

        //add the new data to the new array
        newArray[newArray.length-1] = newData;

        //update the data to include the addition
        setData(newArray);
    }

    /**
     * @return Returns the max-heap
     */
    public int[] getData() {
        return data;
    }

    /**
     * Note that you might to need to 
     * @param data set the array
     */
    public void setData(int[] data) {
        this.data = MaxHeapMaker.heapify(data);
    }
}
