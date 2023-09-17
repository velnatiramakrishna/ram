package oparators;

public class ArthematicOparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=5,c=10,d=15;
		 if ((a==b)&&(c!=d) ){
			 System.err.println("the both conditions is true  "+(a*b));
			 if ((a!=c)||(b<=d) ){
				 System.out.println("one of the condition istrue :"+(d-a));
				
			}
			
		}
		 else {
			System.out.println("the condition should be wrong  "+(c+d));
		}

	}

}
