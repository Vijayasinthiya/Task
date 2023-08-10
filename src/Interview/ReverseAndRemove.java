package Interview;

public class ReverseAndRemove {
	public static void main(String[] args) {
		String a = "abc123def";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			if (a.charAt(i) != '1') {
				b = b + a.charAt(i);
			}
		}
		System.out.println(b);
	}
}
