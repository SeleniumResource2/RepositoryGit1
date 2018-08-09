package BasicPgms;

public class StringReversal {
	public static void main(String[] args) {
		
	
	String Name="Welcome";
	String rev="";
	
	for(int i=Name.length()-1; i>=0; i--){
		char ch = Name.charAt(i);
		rev = rev+ch;
	}
	System.out.println("Reversed string is : " + rev);
}
}
