package interview.com;

public class Palindrome {

	private static String str1 = "kadak";
	
	public static void main(String[] args) {
		
		int length = str1.length();
		if(length%2 == 0) {
			checkIfPalindrome(str1, length/2-1, (length/2));
		} else {
			checkIfPalindrome(str1, length/2, length/2);
		}
		
	}

	private static void checkIfPalindrome(String str, int begin, int end) {
		while(begin>=0 && str.charAt(begin) == str.charAt(end) && end<str.length()) {
			begin--;
			end++;
		}
		
		if(str.length() == end - begin -1) {
			System.out.println("String you passed is palindrome");
		} else {
			System.out.println("String you passed is not palindrome");
		}
		
	}
}
