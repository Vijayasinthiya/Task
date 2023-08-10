package Interview;

public class IntToLetter {
	public static String Letter(int  number) {
		String[] units= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String[] tens= {"zero","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		if(number>=0&&number<20) {
			return units[number];
		}
		else if(number>=20&&number<100) {
			int ten=number/10;
			int unit=number%10;
			return tens[ten]+" "+units[unit];
		}
		else {
			return "number out of range";
		}
}
	public static void main(String[]args) {
//		int number=5;
		int number=22;
		String word=Letter(number);
		System.out.println(word);
	}


}
