//write a java program to find the largest  and lowest numbers by using conditional operators
package ram;

public class Largestnumber {

	public static void main(String[] args) {
		int x=70,y=120,z=30;
		
		int hn=((x>y&&x>z)?x:(y>z&&y>x)?y:z);
		System.out.println("the largest number is :"+hn);
       int ln=((x<y&&x<z)?x:(y<x&&y<z)?y:z);
       System.out.println("the lowest number is :"+ln);
	}

}
