package Interview;

public class IntJoin {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 6, 2, 3, 5 };
		int a = 0;
		int b = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j <= i; j++) {
				if (arr1[i] != arr2[j]) {
					a = arr1[i];
					b = arr2[j];
					System.out.println(a);
					System.out.println(b);
				}

			}

		}
	}
}
