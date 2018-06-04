package Midterm1ReviewAgain;

public class QuickTest {

	static int a = 2;
	
	public static void main(String[] args) {
		System.out.println(a + " : The class level variable"); //printing class variable value
		QuickTest qt = new QuickTest();
		qt.printLocal();
		System.out.println(a + " : The class level variable"); //unchanged because 
		//above method has the LOCAL version of the same variable
	}
	
	public static void printLocal(){
		int a = 5; //the local version of the variable with the same name. Is only changed here in this method
		System.out.println(a + " : The local variable 'a'");
	}

}
