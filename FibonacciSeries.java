package BasicPgms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0, b=1, c;
		
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);
		
		for(int i=0;i<=10; i++){
			c=a+b;
			System.out.println("Value of c is : " + c);
			a=b;
			b=c;
		}
	}
}
