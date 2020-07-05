package SQL.JDBC;

public interface InterfaceTest {

	
	public int age=10;					//By default,instance variables are final(constant) and static in nature even when we dont write.
	public String address="123";
	
	public void method1();				// By default, all methods are abstract in nature even if we dont write.
	
	public abstract void method2();
	
	//public InterfaceTest() {}		// Interfaces can't have constructors also. Neither we can create their objects.


	//Interface cant have concrete methods.Only abstract methods are allowed.
	
	
}
