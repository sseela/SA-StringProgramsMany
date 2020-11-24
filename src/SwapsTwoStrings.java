import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SwapsTwoStrings {
	public static void main(String[] args) {
		String s1 = "uvwxyz";
		String s2 = "sandeep";
		
		s1 = s1.concat(s2);
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1+" "+s2);
		
		Set<Character> set1 = s1.chars().mapToObj(c-> (char) c).collect(Collectors.toSet());
		System.out.println(set1);
		
		Map<String, Long> map = Stream.of(s1.split("")).collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println(map);
		
		Map<Character, Long> map2 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		System.out.println(map2);
		
	}
}
