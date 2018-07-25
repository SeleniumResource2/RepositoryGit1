package TestPack;

public class TestCase2 {
	public static void main(String[] args) {
		testcasetwo();
		testcasetwo(3, 4, 5);
	}
	
	public static void testcasetwo(){
		System.out.println("New test case created in branch - user1");
	}
	
	public static void testcasetwo(int a, int b){
		int c = a+b;
		
		System.out.println("Value of addition is : " + c);
	}

	public static void testcasetwo(int a, int b, int c){
		System.out.println("Value of addition is : " + (a+b+c));
	}
}
