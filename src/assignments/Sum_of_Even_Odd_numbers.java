package assignments;

import java.util.Scanner;

public class Sum_of_Even_Odd_numbers {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting number: ");
        int num= sc.nextInt();
        
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        
        int evenSum = 0, oddSum = 0; 
        int evencount=0, oddcount=0;
        double evenAve , oddAve;
        
        
        System.out.println("Even numbers:");
        for (int i = num; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
                evenSum = evenSum+i;
                evencount++;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("ave of even numbers : "+(evenSum/evencount));
//------------------------------------------------------------------------------------------------------//      
       
        System.out.println("Odd numbers:");
        for (int i = num; i <= end; i++) 
        {
            if (i % 2 != 0) {
            	 System.out.println(i + " ");
                 oddSum=oddSum+i;
                 oddcount++;
             }
         }
         System.out.println("Sum of odd numbers: " + oddSum);
         System.out.println("ave of even numbers : "+(oddSum/oddcount));
      
        

	}

}
