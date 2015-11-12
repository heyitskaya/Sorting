/** 
 * InsertionSorter class implements the Sorter interface.
 * @author 
 **/
public class InsertionSorter implements Sorter {
    private int cursor=1;
    private boolean sorted;//this is the varible that will keep track of what has been sorted

	/** 
	 * Constructor
	 */
	public InsertionSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the insertion sort algorithm to modify the passed-in array
	 * so that its elements are in ascending, sorted order.
	 * Assumes that the passed-in array is an array of int elements.
	 **/
	public void sortArrayInPlace(int[] array)
        {
	    for(cursor=1; cursor<array.length; cursor++)
		{
		    int x=findPosition(cursor,array); //declare a variable called x to hold the index of where the current element should go



		    shiftElements(cursor,array);
		    
		    
		} 
			
	}
    public int findPosition(int cursor, int[]array) //will find the position of where to insert the current number
    {


	for(int i=cursor-1;i>=0;i--) //I will traverse the array from right to left and when I find an element smaller than te element we are currently trying to sort we will return i+1
	    {
		if(array[cursor]>array[i])
		    {
			return i+1;
		    }
		
		
		     
	    }
	return 0; //in the event that we don't find anything return 0
	//this is actually impossible because we are looking for the position of an element we found from the array
    }

    public void shiftElements(int cursor,int[] array) //once we find the position for the element to go into, we shift the rest
    {
	int x=findPosition(cursor,array);
	int y=array[cursor];//call the findPosition element and assign the index of the place the cursor is at to int x
	//array[x]=array[cursor]; //put the element at the position where it should go
	for(int h=cursor; h>x;h--) //this will traverse the array from right to left and shift the value to the value of the index before it
		{
		    array[h]=array[h-1];
		}
	array[x]=y;
	    
    }
		    
	

	
	
	

}
