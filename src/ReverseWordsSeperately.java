
public class ReverseWordsSeperately {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String str = "welcome to java";
		String[] strArray = str.split(" ");
		
		for(int i=0; i<strArray.length; i++) {
			String s = reverseEachWordSeperately(strArray[i]);
			sb.append(s+" ");
		}
		System.out.println(sb);
	}

	private static String reverseEachWordSeperately(String string) {
		StringBuilder sb = new StringBuilder();
		for(int i=string.length()-1; i>=0; i--) {
			sb.append(string.charAt(i));
		}
		return sb.toString();
	}

}
