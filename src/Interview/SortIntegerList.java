package Interview;

import java.util.Arrays;

public class SortIntegerList {
	public static void main(String[]args) {
		int[] arr= {3,5,6,7,1,2,9};
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(arr));
}
	}


