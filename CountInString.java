package BasicPgms;

public class CountInString {
	
	public static void main(String[] args) {
		String a = "Welcome To Java Class @123";
		
		int countOfCaps=0, countOfSmallcase=0, countOfDigits=0, countOfSpecialChar=0;
		
		for(int i=0;i<a.length();i++){
			char ch = a.charAt(i);
			if(Character.isUpperCase(ch)){
				countOfCaps++;
			}else if(Character.isLowerCase(ch)){
				countOfSmallcase++;
			}else if(Character.isDigit(ch)){
				countOfDigits++;
			}else{
				countOfSpecialChar++;
			}
		}
		
		System.out.println("Count of Caps : " +countOfCaps );
		System.out.println("Count of small case : " + countOfSmallcase);
		System.out.println("count of digits " + countOfDigits);
		System.out.println("count of special character is : " + countOfSpecialChar);
	}

}
