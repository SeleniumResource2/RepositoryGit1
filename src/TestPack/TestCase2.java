package TestPack;

public class TestCase2 {
	public static void main(String[] args) {
		testcasetwo();
	}
	
	public static void testcasetwo(){
		System.out.println("New test case created in branch - user1");
	}
	
	public static void testcasetwo(int a, int b){
		int c = a+b;
		
		System.out.println("Value of addition is : " + c);
	}

}
