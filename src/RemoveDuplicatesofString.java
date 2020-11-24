
public class RemoveDuplicatesofString {
	public static void main(String[] args) {
		String str = "karreeemulla";
		char[] arr = str.toCharArray();
		String str1 = "";
		for(char c: arr) {
			if(str1.indexOf(c) == -1) {
				str1 = str1 + c;
			}
		}
		System.out.println(str1);
	}
}
