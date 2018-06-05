package Midterm1ReviewAgain;

public class PassByValueReview {

	public static void main(String[] args) {
		int b = 9;
		System.out.println("b (after initialization): " + b);
		
		increase(b);
		
		System.out.println("b (after the increase method is executed):" + b);
	}
	
	public static void increase(int b){
		b++; //increase b by 1 for each call
		System.out.println("b's current value (inside the method using the start"
				+ "point of b's value as a parameter): " + b);
	}
}
