package Interview;

public class Fibonacci {
	int a=0;
	int b=1;
	int c=1;
	public void fibo(int f) {
		for(int i=0;i<f;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
			}
		}
	public static void main(String[]args) {
		Fibonacci fi=new Fibonacci();
		fi.fibo(5);
		}
	}
