//Wap to print  Array integer values and string values by using foreach loop 

package arrays;

public class ForeachArray {

	public static void main(String[] args) {
		
		int arr[]= {12,14,14,44};   //integer values
		
		String str[]= {"ram","sita","laxman","ravana"};   //string values
		
		System.out.println("int array");
	
		for(int a1:arr) {//foreach for retriveing the integer values
			
			System.out.println(a1);
		}
		
		for(String s1:str) {  //foreach for retriveing the string values
			
			System.out.println(s1);
		}
	}

}
