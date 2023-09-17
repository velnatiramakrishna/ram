package consturoctor;

public class DemoConstutoctor {

	public static void main(String[] args) {
		Five a1=new Five();
		Five a2=new Five(20,30);
		a1.hyd();
		
	}

}
  class Five {
	  // the Five class have 2 constuctors (1 argumented and 1 non argumented)
	  //and one non-static method
	  
	  Five() {   //non-argumented constuctor
		  System.out.println("this is constuctor");
	  }
	  Five(int x,int y)  //argumented constuctor
	  {
		 System.out.println("the sum of  x + y is :"+(x+y)); 
	  }
	 
	public void hyd() {  //non-static method
		System.out.println("hyd is a one of the big city");
	}
	
}
 