import java.util.Arrays;
import java.util.StringJoiner;

//Pick any unsorted item, then find proper place in sorted list to place it

public class InsertionSorting {
	public static void insertionSort(int[] elements) {
		int possibleIndexCounter = 0;
		int tempAssignedCounter = 0;
		for (int j = 1; j < elements.length; j++) {
			System.out.println("at top of for loop, array looks like  " + Arrays.toString(elements));
			System.out.println("Still at top, we have selected this element to place: " + elements[j] + "; with loop index j of:  " + j);
			System.out.println("sorted portion of array is:  " + printSubArray(elements, j));
			int temp = elements[j];
			int possibleIndex = j; 

			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) { //j is greater than 0 and 
					//the element we are holding is less than the spot checking in sorted array
				elements[possibleIndex] = elements[possibleIndex - 1]; 
					//we are starting at the right of the sorted array and looking leftward until we find the spot
					//when spot is found, while loop breaks and that becomes the index to stick it in
				possibleIndex--; // count these in question 16
				possibleIndexCounter++;
			}
			elements[possibleIndex] = temp; // count these in question 17
			tempAssignedCounter++;  //to do the count of what was requested in question 17  
			System.out.println("bottom of for loop\n");
		}

		System.out.println("counts of possible index assignments:  " + possibleIndexCounter);
		System.out.println("counts of temp assigned to elements  " + tempAssignedCounter);
	}

	/**
	 * Brings in array and maximum index returning a string of the subset
	 * 
	 * @param elements is array coming in
	 * @param j        index to stop outputting subset array
	 * @return string consisting of subset of elements
	 */
	private static String printSubArray(int[] elements, int j) {
		StringJoiner result = new StringJoiner(", ");
		for (int i = 0; i < j; i++) {
			result.add(String.valueOf(elements[i]));
		}
		return result.toString();
	}

}
