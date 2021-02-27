import java.util.Arrays;

public class InsertionTestApp {
	
    public static void main(String[] args)
    {
		int[] //arr1 = {3, 86, -20, 14, 40};
		arr1 = { 1, 2, 3, 4, 0, 55,55,55,55,22};
  		System.out.println("Array starts out as:  " + Arrays.toString(arr1));
  		InsertionSorting.insertionSort(arr1);
     	System.out.println("Sorted array is:  " + Arrays.toString(arr1));
     } 
	

}
  