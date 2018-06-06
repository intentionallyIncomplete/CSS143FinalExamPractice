package CustomExceptionsDemo;

public class CustomExceptionHandler {
	
	public static void main(String[] args) throws BadSpellingException{
		String testString = "helloo";
		String comparativeString = "hello";
		
		if(testString.equals(comparativeString)){
			System.out.println("not mispelled");
		}else{
			throw new BadSpellingException(testString);
		}
	}
}
