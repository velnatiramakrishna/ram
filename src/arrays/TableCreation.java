package arrays;

import java.util.Scanner;

public class TableCreation {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("ENTER THE NUMBER");
		
		
		num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+"*"+i+"="+num*i);
		}
		
	}

}
