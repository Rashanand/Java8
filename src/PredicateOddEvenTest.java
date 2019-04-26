import java.util.function.Predicate;

public class PredicateOddEvenTest {
	public static void main(String[] args) {
		String [] strArr = {"Durga", "Nithin", "Nayathara", "Sunny Leone"};
		
		Predicate<String> p = str -> str.length() > 6;
		
		for(String s : strArr) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}
}
