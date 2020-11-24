
public class ReplaceAll {
	public static void main(String[] args) {
		String str = "welcome#@$@ to &&Java";
		String s = str.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(s);
	}
}
