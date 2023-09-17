package loopingStatements;

public class DoWhile {
	public static void main(String[] args) {
		int i=1,num=15;
		System.out.println("the odd numbers is: ");
		do {
			
			if (i%2!=0) {
				System.out.print(i+" ");
				
			}
			i++;
			
			
		} 
		while (i<=num);
	}
}
