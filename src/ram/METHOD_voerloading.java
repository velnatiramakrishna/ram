package ram;

public class METHOD_voerloading {

	public static void main(String[] args) {
		add();
		add( 5,10);
		add(5,12.3);
		add(45.6,23);
	}
	public static void add() {
		int a=5, b=6;
		System.out.println(a+b);
	}
public static void add(int a,int b) {
	System.out.println(a*b);
		
	}
public static void add(int a,double b) {
	
	System.out.println(a+b);
}
public  static void add(double a,int b) {
	System.out.println(a+b);
}

}
