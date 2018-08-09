package BasicPgms;

public class ReverseNumber {
	
	//input is 123 and output is 321
	public static void main(String[] args) {
		
	int a= 123;
	int j =0, i;
	while(a>0){
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	System.out.println("Value of j is : " + j);
	}
}
