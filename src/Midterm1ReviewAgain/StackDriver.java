package Midterm1ReviewAgain;

public class StackDriver {

	public static void main(String[] args){
		Stack newStack = new Stack(4);
		
		newStack.push("one");
		System.out.println(newStack.peek());
		newStack.push("two");
		System.out.println(newStack.peek());
		newStack.push("three");
		System.out.println(newStack.peek());
		newStack.push("four");
		System.out.println(newStack.peek());
		newStack.push("five");
		System.out.println(newStack.peek());
	}
}
