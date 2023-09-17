//wap to print present in the string in the revers  
package assignments;

public class Reves_String {

	public static void main(String[] args)
	{
	String s="hello people";
	String s1="";
	String[] str=s.split("");
	for(int i=0;i<str.length;i++) 
	{
		String str1=str[i];
		String str2=" ";
		for(int j=str1.length()-1;j>=0;j--) 
		 {
			str2=str2+str1.charAt(j);
		}
		s1=s1+str2+" ";
	}
	System.out.println(s1);
	}

}
