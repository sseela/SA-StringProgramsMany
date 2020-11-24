import java.util.Arrays;

public class ReverseStringPreservingSpaces {
	public static void main(String[] args) {
		String str = "sandeep is a java developer";
		char[] arr = str.toCharArray();
		char[] temp = new char[arr.length];
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				temp[i] = ' ';
			}
		}
		
		int j = str.length()-1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				if(temp[j] == ' ') {
					j--;
				}
				temp[j] = str.charAt(i);
				j--;
			}
		}
		System.out.println(String.valueOf(temp));
	}
}
