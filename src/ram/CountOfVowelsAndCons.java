package ram;

import java.util.Scanner;

public class CountOfVowelsAndCons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING ");
		String str=sc.nextLine();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vcount++;
			}
			else {
				ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
	}

}
