package ram;


	class City {
	    void Info() {
	        System.out.println("This is a parent city.");
	    }
	}

	class Bangalore extends City {
	    @Override
	    void Info() {
	        System.out.println("Welcome to Bangalore - The green park in India.");
	    }
	}

	class Delhi extends City {
	    @Override
	    void Info() {
	        System.out.println("Welcome to Delhi - The Capital of India.");
	    }
	}

	class Chennai extends City {
	    @Override
	    void Info() {
	        System.out.println("Welcome to Chennai - The Gateway to South India.");
	    }
	}

	public class METHOD_OverRiding {
	    public static void main(String[] args) {
	        City city1 = new Bangalore();
	        City city2 = new Delhi();
	        City city3 = new Chennai();
	        
	        city1.Info();
	        city2.Info();
	        city3.Info();
	    }
	}



