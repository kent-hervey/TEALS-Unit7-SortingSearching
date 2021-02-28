import java.util.Arrays;

public class InsertionTestApp {
	
    public static void main(String[] args)
    {
		int[] //arr1 = {3, 86, -20, 14, 40};
		arr1 = { 4,3,2,1};
  		System.out.println("Array starts out as:  " + Arrays.toString(arr1));
  		InsertionSorting.insertionSort(arr1);
     	System.out.println("Sorted array is:  " + Arrays.toString(arr1));
     } 
	

}
  