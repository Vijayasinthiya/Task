package Interview;

import java.util.Arrays;

public class StringSort {
	public static void main(String[]args) {
		String value="cbafed";
		char[] ch=value.toCharArray();
		Arrays.sort(ch);
		String a=new String(ch);
		System.out.println(a);
		
	}

}
