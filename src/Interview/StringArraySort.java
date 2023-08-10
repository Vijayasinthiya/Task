package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class StringArraySort {
	public static void main(String[] args) {
		String[] a= {"java","is","Language"};
		String temp=" ";
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j].length()<a[i].length()) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
	List<String> list=Arrays.asList(a);
list.stream().sorted(Comparator.comparing(x->x.length())).forEach(x->System.out.println(x));


		
	}

}
