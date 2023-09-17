//WAP TP PRINT LAST DIGIT OF AN GIVEN NUMBER BY CREATING A SPECIAL METHOD .
package arrays;

import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();  //it will takeing the value manuvally and it will storeing the variable as num

		number(num); // i will call directly by the method neme
		 
		             //because it is a static method so i will give x_value is num 
		
		

	}
	public static void number(int x) { //it is a parametarised static metod
	
		int lastdigit;
		lastdigit=x%10;
		System.out.println("the last digit is  :"+lastdigit);
	}

}
