package interview.com;

public class PalindromeByReversing {

	private static String str = "manam";
	
	public static void main(String[] args) {
		
		checkIfPalindromeOrNot(str);
	}

	private static void checkIfPalindromeOrNot(String str) {
		String rev = reverse(str);
		if(str.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		
	}

	private static String reverse(String str) {
		//reverse of a string can be done in two ways: 1. Recursion, 2.For loop
		/*if(str.isEmpty()) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);*/
		
		
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		return rev;
		
	}
}
