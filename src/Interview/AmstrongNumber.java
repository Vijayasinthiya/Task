package Interview;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
	    int num=s.nextInt();
		int nums=num;
//		int num=153;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(sum==nums) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		
	}

}



