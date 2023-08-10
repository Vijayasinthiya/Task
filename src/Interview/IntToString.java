package Interview;

public class IntToString {
	public static void main(String[]args) {
		String value="a1b2c3";
		int num=0;
		char c=' ';
		int count=0;
		for(int i=0;i<value.length();i++) {
			if(i%2!=0) {
				
				num=Integer.parseInt(Character.toString(value.charAt(i)));
			}
			else 
				c=value.charAt(i);
				count++;
			
			if(count==2) {
				for(int j=0;j<num;j++) {
//					System.out.print(c);
				}
				count=0;
			}
		}
		char[] a=value.toCharArray();
		for(int i=0;i<a.length;i=i+2) {
			int b=a[i+1]-'0';
			for(int j=1;j<=b;j++) {
				System.out.print(a[i]);
			}
		}
	}

}
