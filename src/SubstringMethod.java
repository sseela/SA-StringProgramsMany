
public class SubstringMethod {
	public static void main(String[] args) {
		String s1 = new String("apple");
		String s2 = "mango";
		String s3 = "apple";
		String s4 = s1.substring(0, 5);
		System.out.println(s4 == s3);
	}
}
