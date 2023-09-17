package ram;

public class Polymorphism {

	
		//method overloading
		public class Method_overloading {
		String name;
		int age;
		public void displayInfo(String name) {
			System.out.println(name);
		}	
		public void displayInfo(int age) {
			System.out.println(age);
		}
		public void displayInfo(String name, int age){
			System.out.println("Name :"+name+"\n"+"Age"+age);
		}
		public static void main(String[] args) {
			Method_overloading m1= new Method_overloading();
			m1.displayInfo("Praveen", 26);
		}
			
			
		}
		//method Overriding
		class A{
			public void name() {
				System.out.println("print A");
			}
			public void name2() {
				System.out.println("print c");
			}
			public static void name3() {
				System.out.println("gdh");
			}
		}
		class B extends A{
			public void name1() {
				
			}
		     @Override
			public void name() {
				
				System.out.println("print B");
			}
			
			public static void name3() {
				
			}

		}


		public class Method_Overriding extends B {
			public static void main(String[] args) {
				Method_Overriding m2 = new Method_Overriding();
				m2.name();
				m2.name1();
			}

		}

	}


