package ram;

public class VowelOrNot {

	public static void main(String[] args) {
		char ch='A'; //non-static variables
		
		if((ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u')||(ch=='A'|ch=='E'|ch=='I'|ch=='O'|ch=='U'))
		{
			System.out.println("Entered alphabet is vowel "+ ch);
		}
		else
		{
			System.out.println("Entered alphabet is not a vowel "+ ch);
		}

	}

}
