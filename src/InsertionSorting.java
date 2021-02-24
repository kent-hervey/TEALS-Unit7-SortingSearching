import java.util.Arrays;

 public class InsertionSorting
 {
	public static void insertionSort(int[] elements)
   	{
		for (int j = 1; j < elements.length; j++)
      	{
         	   int temp = elements[j];
        	   int possibleIndex = j;
        	   while (possibleIndex >0 && temp< elements[possibleIndex - 1])	
		   {
			  elements[possibleIndex] = elements[possibleIndex - 1];
			  possibleIndex--;
            }
       	   elements[possibleIndex] = temp;
       	}	
    }   		
       		

 }    
 