import java.util.Arrays;

public class InsertionTestApp {
	
    public static void main(String[] args)
    {
		int[] arr1 = {3, 86, -20, 14, 40};
  		System.out.println(Arrays.toString(arr1));
  		InsertionSorting.insertionSort(arr1);
     	System.out.println(Arrays.toString(arr1));
     } 
	

}
