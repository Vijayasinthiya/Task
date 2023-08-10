package Interview;

public class StringCompress {

	public static void main(String[] args) {

		int count = 1;
		StringBuilder val = new StringBuilder();
		String[] arr = { "t", "e", "e", "s", "s", "s", "h" };
		for (int i = 0; i < arr.length; i++) {
			String currentCharacter = arr[i];
			if (i < arr.length - 1 && currentCharacter == arr[i + 1]) {
				count++;
			} else {
				val.append(currentCharacter);
				if(count!=1) {
				val.append(count);
				}
				count = 1;
			}
		}
		System.out.println(val);
	}
}
