
public class StringPermutation1 {
	public static void main(String[] args) {
		findPermutation("abc");
		
	}

	private static void findPermutation(String string) {
		findPermutation1("", string);
		
	}

	private static void findPermutation1(String permutation, String word) {
		if(word.length()==0) {
			System.out.println(permutation);
		}
		else {
			for(int i=0; i<word.length(); i++) {
				findPermutation1(permutation+word.charAt(i), word.substring(0, i)+word.substring(i+1));
			}
		}
		
	}
}
