package BasicPgms;

public class PalindromeString {
	
	public static void main(String[] args) {
		String Name = "MADAM";
		String rev = "";
		for(int i=Name.length()-1; i>=0; i--){
			char ch = Name.charAt(i);
			rev = rev+ch;
		}
		System.out.println("Reversed string is : " + rev);
		
		if(rev.equals(Name)){
			System.out.println("This is a Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}
	}

}
