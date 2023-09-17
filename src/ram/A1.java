//wap to use this and super keyword
package ram;

  public class A1 {
int a=10;//nsv
}
 class B1 extends A1
 {
	 int a=30;// nsv
	 public void m1() {
		 int a=20;//lv
		 System.out.println("in the non static methos"+a+"local variable");
		 System.out.println("to access the non static variable of class B1 is "+this.a);
		 System.out.println("to access the super class variable "+super.a);
	 }
	 public  static void main(String []main) {
		 B1 a1=new B1();
		 a1.m1();
	 }
 }
