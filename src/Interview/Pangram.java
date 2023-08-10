package Interview;

public class Pangram {
	public static void main(String[]args) {
//		String a = "The five boxing wizards jumps quickly";
//		String a="sinthu";
		String a="abcdefghijklmnopqrstuvwxyz";
		a = a.toLowerCase();
		
//		System.out.println(a);
		String b = "";
		for (char i = 'a'; i <= 'z'; i++) {
			if (a.indexOf(i) != -1) {
				b = b + i;
			}
//			System.out.println(b);
		}
		if (b.length() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not Pangram");
		}
	}
	
}
