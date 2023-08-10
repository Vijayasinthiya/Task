package Interview;

public class RepeatedAndNon {
	public static void main(String[]args) {
		String name="Nishanthi";
		char[] name1=name.toCharArray();
		int count=1;
		int count1=1;
		for(int i=0;i<name1.length;i++) {
			
			for(int j=i+1;j<name1.length;j++) {
				if(name1[i]==name1[j]) {
					count=count+1;
				}
				else {
					count1=count1+1;
				}
			}
		}	
			System.out.println("Reapeated: "+count);
		}
	}

