package conditionStatements;

public class NestedIfstatement {

	public static void main(String[] args) {
		
		int pin=1234; //static variables
		double balance=30000;
		double withdraw=5000;
		
		System.out.println("Welcome to ATM ");
		
		System.out.println("Enter the card details ");
		
		  if(pin==1234)
		   {
			if(balance>=withdraw)
			 {
			 	System.out.println("Your transaction is successfully completed transaction amount is 5000");
				balance=balance-withdraw;
				System.out.println("The aval balance is " + balance);
		     }
			 else
			  {
			  	System.out.println("Insufficient balance "+ balance);
			  }
		   }
	  else
		{
			System.out.println("Incorrect pin");
		}
	}
	
	/*
	 * int pass =35; int sub1=90,sub2=60,sub3=30;
	 * 
	 * if (sub1>=pass) { System.out.println("you are pass the sub1  :"+sub1); if
	 * (sub2>=pass) { System.out.println("you are pass the sub2  :"+sub2); if
	 * (sub3>=pass) { System.out.println("you are pass the sub3  :"+sub3);
	 * 
	 * }
	 * 
	 * } } else { System.out.println("your fail in examination"); }
	 * 
	 * }
	 */

}
