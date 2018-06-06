package Midterm1ReviewAgain;

public class Stack {

	int maxSize;
	int top; //last position in stack
	String arr[];
	
	/*ctor - no args*/
	public Stack(int n){
		//n = size of stack
		this.maxSize = n;
		arr = new String[maxSize];
		top = 0; //index used to put elements in array
		//initialized to 0 (first layer)	
	}
	
	public boolean isEmpty(){
		
		if(this.top == 0){
			System.out.println("stack is empty");
			return true;
		}else{
			System.out.println("stack is not empty");
			return false;
		}
	}
	
	public void push(String str){
		
		if(top < maxSize){ //stack not yet full
			arr[top] = str; //add element to current position in the stack
			top++; //increase index position by 1
		}else{
			System.out.println("stack overflow");
		}
	}
	
	public String pop(){
		
		if(!this.isEmpty()){
			String tempStr = this.peek();
			arr[top-1] = null;
			top--;
			return tempStr;
		}else{
			return null;
		}	
	}
	
	public String peek(){
		if(!this.isEmpty()){
			return arr[top-1]; //always 1 less than the latest
		//element in the stack
		}else{
			return null;
		}
		
	}
}
