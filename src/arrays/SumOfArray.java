//Write a java program to sum values of an array.//
	
package arrays;

public class SumOfArray {
	
		public static void main(String[] args) {
			int arr[]= {10,15,20,25};
			int sum=0;
			
			for(int i:arr) 
			 {
				sum=sum+i;
			 }
			System.out.println("the sum of array is  :"+sum);

		}

}
