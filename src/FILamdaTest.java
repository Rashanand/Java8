interface Interf {
	public void m1();
}
//Top level implementation class not required with Lambda
/*class Demo implements Interf {
	public void m1() {
		System.out.println("Hello...");
	}
	()->System.out.println("Hello...");
}*/
public class FILamdaTest {
	public static void main(String[] args) {
		Interf i = ()->System.out.println("Hello...With Lambda"); 
		i.m1();
	}
}
