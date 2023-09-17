package assignments;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		 int num=sc.nextInt();
		 System.out.println("enter the rem");
         int rem=sc.nextInt();
         System.out.println("enter the sum");
         int sum=sc.nextInt();
         System.out.println("enter the cube");
         int cube=sc.nextInt();
         int temp=num;
         while(num>0)
         {
        	 rem=num%10;
        	 cube=rem*rem*rem;
        	 sum=sum+cube
        			 ;
        	 num=num/10;
         }
         if (sum==temp) {
        	 System.out.println(" it is an armstrong number: "+sum);
		}
         else {
        	 System.out.println("  it is "
        	 		+ "not an armstrong number :"+sum);
         }
	}
}
