import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*class MyComparator implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
		if(i1 > i2)
			return 1;
		if(i1 < i2)
			return -1;
		
		return 0;
		
		(i1>i2) ? 1 : (i1<i2) ? -1 : 0; 
	}
}*/
public class FIComparator {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(5);
		l.add(25);
		l.add(3);
		l.add(30);
		l.add(2);
		l.add(15);
		System.out.println(l);
		//Comparator<Integer> c = (i1, i2) -> (i1>i2)?1:(i1<i2)?-1:0; 
		Collections.sort(l, (i1, i2) -> (i1>i2)?1:(i1<i2)?-1:0);
		System.out.println(l);
	}
}
