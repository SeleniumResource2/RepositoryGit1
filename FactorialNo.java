package BasicPgms;

public class FactorialNo {
	
	public static void main(String[] args) {
		int sum = 1;
		for(int i = 1; i<=5; i++){
			sum = sum*i;
			System.out.println("Sum result in every step : " + sum);
		}
		
		System.out.println("Sum final result is : " + sum);
	}

}
