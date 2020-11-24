package interview.com;

public class Simple {
	private static String STATIC="working";
    private String a = null;
	public static void main(String ads[]){
				String a="working";
				//Simple st= new Simple();
	            //st.a="working";
	            System.out.println(Simple.STATIC==a);
}
}


class Strings {
    public static void main(String ads[]){
        String arr[]={"meow","bray","moo"};
        String a="meow";
        System.out.println(arr[0]==a);
    }
}

class Strings3 {
    public static void main(String ads[]){
        String a="meow";
        String ab=a+"deal";
        String abc="meowdeal";
        System.out.println(ab==abc);
    }
}

class Strings4 {
    public static void main(String ads[]){
        String abc="abc";
        String bed="bed";
        String comb="abcBED";
        System.out.println(abc+bed.equalsIgnoreCase(comb));
    }
}