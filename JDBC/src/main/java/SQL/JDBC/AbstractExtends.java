package SQL.JDBC;

public class AbstractExtends extends AbstractTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractExtends a = new AbstractExtends();
		
		a.method1();
		a.method2();
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is method 2");
	}

}
