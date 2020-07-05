package SQL.JDBC;

// The purpose of an abstract class is to function as a base for subclasses.


public abstract class AbstractTest {

	int age;
	String address;

		public void method1() {						// Concrete method
			
			System.out.println("This is Method1");
			
			
		}
		
		public  abstract void method2();			// Abstract method
		
//public static void main(String[] args) {
//	
//	// AbstractTest t = new AbstractTest();				// Unable to create object of abstract class. So method2 cant be accessed anyways.
//	
//	AbstractTest.method1();				//This can be done for static methods
//	
//	
//}
		
		
}
