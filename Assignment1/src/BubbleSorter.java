import java.util.Arrays;
/**
 * BubbleSorter class implements the Sorter interface.
 * @author 
 **/
public class BubbleSorter implements Sorter {
    private boolean sorted;

    
	/** 
	 * Constructor
	 */
	public BubbleSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the bubble sort algorithm to modify the passed-in array
	 * so that its elements are in ascending, sorted order.
	 * Assumes that the passed-in array is an array of int elements.
	 **/
	public void sortArrayInPlace(int[] array) 
	{
	        
	    sorted=checkSort(array);
	    //System.out.println("Before the while loop");	
	    while(!sorted)	// NEEDS TO BE IMPLEMENTED
		{
		    //System.out.println("inside the loop");
					
		        for(int j=0; j<array.length-1;j++) //one completion of this forloop is one complete traversal of the array
			{
				if(array[j]>array[j+1])
				{
				    swap(j,j+1,array);

				    //System.out.println("bubble sort array (after): " + Arrays.toString(array));
				}
			
			}
			sorted=checkSort(array);
			
			
						
		 //after its done traversing the array and swapping elements call checkSort to see if the array is still unsorted
		}
	    //System.out.println("out of the loop");
	    	
	    //System.out.println("After the while loop");
	
		
			
		
	}
    //   swap(array[element1],array[element2])
    //public void swap(int element1,int element2)
    //{
    //	int x;
    //x=element1;
    //element1=element2;
    //	element2=x;
    //}
    public void swap(int element1, int element2,int[] array) //make sure the parameters
	{
		int x;
		x=array[element1];
		array[element1]=array[element2];
		array[element2]=x;
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
		return true;
	}
	
	

}


	
	


