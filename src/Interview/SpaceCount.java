package Interview;

import java.util.Arrays;
import java.util.List;

public class SpaceCount {
	public static void main(String[]args) {
		String[] values= {"Rajesh"," ","Samuel"," "};
		List<String> names=Arrays.asList(values);
		Long c=names.stream().filter(x->x.equals(" ")).count();
		System.out.println(c);
	}

}
