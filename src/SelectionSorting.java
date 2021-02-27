import java.util.Arrays;

//look through unsorted list, find minimum, then place it

public class SelectionSorting {
	public static void selectionSort(int[] elements) {
		int counterTemp = 0;
		for (int j = 0; j < elements.length - 1; j++) {
			int minIndex = j;
			for (int k = j + 1; k < elements.length; k++) {
				if (elements[k] < elements[minIndex]) {
					System.out.println("Reset minimum found to:  " + elements[k]);
					minIndex = k;
				}
			}
			int temp = elements[j];
			elements[j] = elements[minIndex];
			elements[minIndex] = temp; //problem 18 asks for this count
			counterTemp++;
			
			System.out.println("at bottom of for loop; array now looks like:  " + Arrays.toString(elements));
		}
		System.out.println("number of counts for problem 18:  " + counterTemp);
	}
}
