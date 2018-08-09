package BasicPgms;

public class CountOfGivenNos {
	
	public static void main(String[] args) {
		int a = 12783;
		
		int temp = a;
		
		int j=0, i=0;
		while(a>0){
			i=a%10;
			j++;
			a=a/10;
		}
		System.out.println("Count of given no is : " + j);
	}

}
