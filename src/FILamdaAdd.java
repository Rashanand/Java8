interface Inter {
	public void add(int a, int b);
}

class Demo implements Inter {
	public void add(int a, int b) {
		System.out.println("The sum: "+(a+b));
	}
	
	//(a, b)->System.out.println("The sum: "+(a+b));
}
public class FILamdaAdd {
	public static void main(String[] args) {
		Inter i = (a, b)->System.out.println("The sum (Lambda): "+(a+b));// Demo object not assigned, Object is different
		i.add(10, 20);
	}
}
