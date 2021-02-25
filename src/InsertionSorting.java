import java.util.Arrays;

 public class InsertionSorting
 {
	public static void insertionSort(int[] elements)
   	{
		int possibleIndexCounter =0;
		int tempAssignedCounter =0;
		for (int j = 1; j < elements.length; j++)
      	{
         	   int temp = elements[j];
        	   int possibleIndex = j;  //count these in question 16
        	   possibleIndexCounter++;
        	   while (possibleIndex >0 && temp< elements[possibleIndex - 1])	
		   {
			  elements[possibleIndex] = elements[possibleIndex - 1];
			  possibleIndex--;
            }
       	   elements[possibleIndex] = temp; //count these in question 17
       	   tempAssignedCounter++;
       	}	
		
		System.out.println("counts of possible index assignments:  " + possibleIndexCounter);
		System.out.println("counts of temp assigned to elements" + tempAssignedCounter);
    }   		
       		

 }    
 