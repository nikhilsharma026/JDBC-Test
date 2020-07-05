package SQL.JDBC;

public interface InterfaceTest2 {

	
	public int age=16;					//By default,instance variables are final(constant) in nature even when we dont write.
	public String address="123";
	
	public void method1();				// By default, all methods are abstract in nature even if we dont write.
	
	public abstract void method2();
	
	//public InterfaceTest() {}		// Interfaces can't have constructors also. Neither we can create their objects.


	//Interface cant have concrete methods.Only abstract methods are allowed.
	
	
}
