package BasicPgms;

public class SumOfInteger {
	
	public static void main(String[] args) {
		int a =321;
		int j=0, i=0;
		while(a>0){
			i=a%10;
			j=j+i;
			a=a/10;
		}
		
		System.out.println("Total addition of given integer is : " + j);
	}

}
