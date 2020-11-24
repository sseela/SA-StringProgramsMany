
public class split {
	public static void main(String[] args) {
		String str = "sandeep   	is a 	java 				developer"
				+ " 		karikula"
				;
		System.out.println(str.split("\\s+").length);
	}
}
