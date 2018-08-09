package BasicPgms;

public class Palindrome {
	/*
	 * If provided input is 141 and on manipulation, provides same output as 141 
	 * then, we call it as Palindrome.
	 */
	
	public static void main(String[] args) {
		
		int a = 141;
		int temp = a;
		int j=0, i;
		while(a>0){
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		
		System.out.println("Value of j is : " + j);
	
		if(temp==j){
			System.out.println("It is palindrome number");
		}else{
			System.out.println("Not a palindrome");
		}
	
		}
	
}