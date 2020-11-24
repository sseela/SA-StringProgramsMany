
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Auto generated method stub";
		String[] s = str.split(" ");
		String var = "";
		for(String ele: s) {
			var = var+ele;
		}
		System.out.println(var);
	}

}
