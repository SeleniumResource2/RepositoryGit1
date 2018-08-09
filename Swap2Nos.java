package BasicPgms;

public class Swap2Nos {
	
	public static void withTemp(){
		int a =10, b=20, temp;
		
		temp = a;
		a=b;
		b=temp;
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
	}
	
	public static void withOutTemp(){
		int a =10, b =20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
	}
	
	public static void main(String[] args) {
		withTemp();
		withOutTemp();
	}

}
