import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class trim {
	public static void main(String[] args) {
		String str = "  java 		is a 		programming		lan	";
		String trimmed = str.trim();
		System.out.println(trimmed.replaceAll("\\s+", "@"));
		System.out.println(Arrays.toString(trimmed.split("\\s+")));
		
		
		String str2 = "sandeepp";
		System.out.println(Stream.of(str2.split("")).collect(Collectors.groupingBy(v->v, Collectors.counting())));
		
	}
}
