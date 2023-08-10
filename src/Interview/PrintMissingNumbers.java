package Interview;

public class PrintMissingNumbers {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int num=4;
		int[] out=new int[a.length];
		for(int i=0;i<a.length;i++) {
			out[i]=a[i]+num;	
		}
		for(int ans:out) {
			System.out.println(ans);
		}
		//Another Method
		int c=10;
		for(int i=1;i<c;i++) {
			boolean b=false;
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
					b=true;
					break;
				}
			}
			if(b==false) {
				System.out.println(i);
			}
		}
		
	}

}
