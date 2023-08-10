package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {
		Integer[] a = { 3, 5, 2, 4, 8, 1 };
		List<Integer> list = Arrays.asList(a);
		Collections.reverse(list);
		System.out.println(list);

		Integer[] b = list.toArray(new Integer[list.size()]);
		for (Integer x : b) {
			System.out.print(x + " ");
		}

	}

}
