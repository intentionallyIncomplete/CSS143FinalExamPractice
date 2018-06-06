package CustomExceptionsDemo;

public class BadSpellingException extends Exception{

	
	public BadSpellingException(String s){
		System.out.println("Mispelled: " + s);
	}
}
