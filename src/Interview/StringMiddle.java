package Interview;

public class StringMiddle {
	public static void main(String[]args) {
		String a="Java";
		String b="Developer";
		int index=2;
		StringBuffer str=new StringBuffer(a);
		str.insert(index,b);
		System.out.println(str.toString());
	}

}
