/** 
 * SelectionSorter class implements the Sorter interface.
 * @author 
 **/
import java.util.Arrays;
public class SelectionSorter implements Sorter {
    private boolean sorted;
    private int cursor=0;
	/** 
	 * Constructor
	 */
	public SelectionSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the selection sort algorithm to modifies the passed-in 
	 * array so that its elements are in ascending, sorted order.
	 * Assumes that the passed-in array is an array of int elements.
	 **/
	public void sortArrayInPlace(int[] array) 
	{
	    sorted=checkSort(array);
		int min;
	         //use a variable called cursor to keep track of what has been sorted
		// NEEDS TO BE IMPLEMENTED
	        while((!sorted)&& (cursor<array.length))
		{
		    //System.out.println("in the while loop");
		    min=findMinimum(cursor,array); //find the index of the smallest value
			//System.out.println
		        swap(min, cursor,array);
			cursor=cursor+1; //uncomment this later
			sorted=checkSort(array);
		}
	}

        public void swap(int element1, int element2,int[] array) //used to swap two elements
	{
		int x;
		x=array[element1];
		array[element1]=array[element2];
		array[element2]=x;
	}
	public int findMinimum(int startingPoint,int[] array)
        {
    
	    
		int minValue=array[startingPoint];
		int minIndex = startingPoint;
		for( int i=startingPoint; i<array.length-1;i++) //traverse the array once
		{
		    
			if(minValue >array[i+1]) //if the minimum value is bigger than array[i+1] have minValue equal to the new smaller value
			{
				minValue=array[i+1];
				minIndex = i+1;
				//System.out.println(minValue);
				
				
			}
			//else do nothing
			
		}
	        //System.out.println(startingPoint + ", " + minValue); //something wrong with finding the minimum value there is only supposed to be one min values
		return minIndex;
	}
	public boolean checkSort(int[] array) //to check to see if the array is sorted will return true if sorted
	{
		for (int i=0; i<array.length-1;i++) //traverse the array except for the last element
		{
			if (array[i]>array[i+1]) //if array[i]>array[i+1] then the array is not sorted
			{
				return false; //so return false
			}
		}
		return true; //else return true
	}

}

        










	

			
		




