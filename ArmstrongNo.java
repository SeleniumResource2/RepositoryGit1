package BasicPgms;

public class ArmstrongNo {
	
	/*If the provided input is Multiplied in cubes and final output results 
	 * to same input then we call it as Armstrong number
	 */
	
	public static void main(String[] args) {
		
		int a = 153;
		int temp = a;
		int j=0, i;
		while(a>0){
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		
		System.out.println("Value of j is : " + j);
	
		if(temp==j){
			System.out.println("It is Armstrong number");
		}else{
			System.out.println("Not an Armstrong number");
		}
	
		}
	}


