package SQL.JDBC;

public class Modifiers {

	private int age=5;
	
	protected int age1=8;
	
	int age2=10;
	
	public int age3=9;
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modifiers m = new Modifiers();
		System.out.println(m.age);
		System.out.println(m.age1);
		System.out.println(m.age2);
		System.out.println(m.age3);
	}

}
