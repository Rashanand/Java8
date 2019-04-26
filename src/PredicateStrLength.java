import java.util.function.Predicate;

public class PredicateStrLength {
	public static void main(String[] args) {
		int [] nos = {5, 10, 15, 20, 25, 30, 35};
		
		Predicate<Integer> p = i -> i%2==0;
		
		for(int i : nos) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}
