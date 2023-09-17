
//wap to print n number of fibonacci series
package assignments;

public class Fibonacci_Series {
                                              //KEY POINTS 
	public static void main(String[] args) { //perform sum b/w 2 numbers
		int n1=0;                            //move the value from n2 to n1 
		int n2=1;                            //move value from sum to n2
		int sum=0;
		int i=1;
        int num=10;
		
		System.out.println(n1);
		System.out.println(n2);
	    while (i>=0)
		//for( i=1;i<=num;i++)
		{			
		  sum=n1+n2;
		  n1=n2;
		  n2=sum;
		  System.out.print(sum+"  ");
	      
		  i++;
	    	}
		}

	}


