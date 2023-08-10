package Interview;

import java.util.Arrays;

public class StringReverse {
	public static void main(String[]args) {
		String a="I am from Bangalore";
		String[] a1=a.split(" ");
		String b=" ";
			for(int i=a1.length-1;i>=0;i--) {
		b=b+" "+a1[i];
			}	
	System.out.println(b);
	
	}

}
