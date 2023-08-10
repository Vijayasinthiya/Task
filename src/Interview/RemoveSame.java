package Interview;

import java.util.Arrays;
import java.util.List;

public class RemoveSame {
	public static void main(String[] args) {
		String a = "This is Nisha and This is my Laptop";
		String[] b = a.split(" ");
		
		List<String> value=Arrays.asList(b).stream().distinct().toList();
		value.forEach(x->System.out.print(x+" "));
		
			
		}
				}

			