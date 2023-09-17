package variables;

public class TypesOfVariables {
	

		public static void m5()
		{
			int pin=1234; //static variables
			double balance=30000,withdraw=5000;
			System.out.println("Welcome to ATM ");
			System.out.println("Enter the card details ");
			if(pin==1234)
			{
				if(balance>=withdraw)
				{
					System.out.println("Your transaction is successfully completed");
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
	
		public void m6() 
		{
			char ch='I'; //non-static variables
			if((ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u')||(ch=='A'|ch=='E'|ch=='I'|ch=='O'|ch=='U'))
			{
				System.out.println("Entered alphabet is vowel "+ ch);
			}
			else
			{
				System.out.println("Entered alphabet is not a vowel "+ ch);
			}
		}
		//------------------------------------------------------------------------------------------------//
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		  B.m1();
		  
		  B b = new B();
		  b.m2();
		  
		  C.m3();
		  
		  C c = new C();
		  c.m4();
		  
		  TypesOfVariables.m5();
		  
		  TypesOfVariables a = new TypesOfVariables();
		  a.m6();
		}

	}
//----------------------------------------------------------------------------------------------------//

	class B
	{
		public static void m1() //static method
		{
			int x=5; //static variables
			int y=6;
			int z=x+y;
			System.out.println(z);
		}
		public void m2() 
		{
			String s1 ="Ram"; // non-static variables
			String s2= "sita";
			System.out.println(s1+s2);
		}
	}
//---------------------------------------------------------------------------------------------------------/
	class C
	{
		public static void m3()
		{
			Long ap=7000000L; //static variables
			Long ts=6800000L;
			if(ap>ts) {
				System.out.println("ap has more population than ts and the population of ap is "+ ap);
			}
			else
			{
				System.out.println("ts has more population than ap and the population of ts is "+ ts);
			}
		}
	
		public void m4()
		{
			int a=5;//non-static variables
			if(a%2==0)
			{
				System.out.println("It is an Even no." + a);
			}
			else
			{
				System.out.println("It is an odd no. " + a);
			}
		}
		
	}


	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		A.m1();
		B.m2();
		C obj =new C();
		obj.m3();
		D obj1=new D();
		

	}

}

class A{
	 int c;//instance variable
     public static void m1()//static method
   
	{*/
       /* int c=5;
    	int x =10;//static variables
    	int y=5;
    	int z=x+y+c;
		System.out.println("the z value is "+z );
		
	}
	
}
class B{
	
	public static void m2()//static method
	{
		String s1= "rama",s2="sita",s3="hanuman",s4="ravana";//static variables
		
		System.out.println(s1+"  is a charactor of ramayana");
		
	}
	
}
class C{
	public void m3()//non-static method
	{
		long n=10000L;
		float n1=123.4f;
		System.out.println(n+" is a long value ");
		System.out.println(n1+ "  is a float value");
		
	}
	
}
class D{
	public void m4()//non-static method
	{
		
		System.out.println();
		
	}
	
}
*/