//wap to print prime numbers b/w 1 to 50
package loopingStatements;

//import java.util.Iterator;

public class Assignment2PrimeNum {
	static int count=0;//sv

	 public static void main(String[] args) {
		 
		 int num=50;//lv
		 System.out.println("the prime numbers are :");
		 for(int i=1;i<=num;i++) { // in the first for loop heck 
			 count=0;
			 //for(int j=2;j<=i/2;j++) {
			 for(int j=1;j<=i;j++) {
				 if (i%j==0) {
					count++;
				}
			 }
			 if (count==2) {
				System.out.print(i+"  ");
			}
		 }
	 }
	 
	 
	 
	 }
	       /* System.out.println("Prime numbers between 1 and 50:");

	        for (int num = 2; num <= 50; num++) {
	            boolean isPrime = true;

	            // Check if the number is prime
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(num + " ");
	            }
	        }
	    
*/
		

 