package SQL.JDBC;

public class InterfaceImplementingClass implements InterfaceTest,InterfaceTest2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceImplementingClass i = new InterfaceImplementingClass();
		// InterfaceTest t = new InterfaceTest();				//Cant create object of interface
		
		i.method1();
		i.method2();
		
		
	}

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Running");
		//System.out.println(age);			//Here the age field is ambiguous as both interfaces have different value.So which one to choose complier is confused
	}

	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Fine");
		//System.out.println(address);		//Address field is ambiguous since both interface have same variable called address.
	
	
		//Java does not support multiple inheritance, that's why you can't extend a class from two different classes at the same time. 
		//Rather, use a single class to extend from, and use interfaces to include additional functionality.
	
	}
	
	
	

}
