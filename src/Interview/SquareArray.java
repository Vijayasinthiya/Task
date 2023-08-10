package Interview;

public class SquareArray {
	public static void main(String[]args) {
		int[] a= {5,6,3,2,8,9};
		int count=0;
		for(int i=0;i<a.length;i++) {
			int square=a[i]*a[i];
			if(square>20) {
				count++;
				}
			System.out.print(square+" ");
		}
			System.out.println("\ncount:"+count);
		
		}
			}


