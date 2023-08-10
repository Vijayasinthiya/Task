package Interview;

public class LeapYear {
	public String leapYear(int a) {
		if(a%4==0) {
			return "It is Leap Year";
		}
		else {
			return "It is not Leap Year";
		}
	}
	public static void main(String[]args) {
		LeapYear leap=new LeapYear();
		
		System.out.println(leap.leapYear(2001));
		
	}

}
