package interview.com;

public class ReverseStringRecursively {
	private static String str = "sandeep";
	public static void main(String[] args) {
		String rev = reverse(str);
		System.out.println(rev);
	}
	
	private static String reverse(String str) {
		return str.isEmpty() ? str: reverse(str.substring(1))+str.charAt(0);
	}
}
