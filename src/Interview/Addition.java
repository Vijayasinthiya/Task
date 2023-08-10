package Interview;

import java.util.Arrays;

public class Addition {
		public static void main(String[] args) {
			String data = "1+3-2";
			String[] a = data.split("[+-]");
			System.out.println(Arrays.toString(a));
			String[] b = data.split("\\d+");
			System.out.println(Arrays.toString(b));
			
			int num = Integer.parseInt(a[0]);
			
			for (int i = 1; i < a.length; i++) {
				if (b[i].equals("+")) {
					num += Integer.parseInt(a[i]);
				} else {
					num -= Integer.parseInt(a[i]);
				}
			}

			System.out.println(num);
		}
	}



