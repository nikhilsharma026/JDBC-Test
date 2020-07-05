package SQL.JDBC;

public class Modifiers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modifiers m = new Modifiers();
		//System.out.println(m.age);				// Not visible as it is private. Only visible in same class. Use private when we want access limited to same class only.
		System.out.println(m.age1);
		System.out.println(m.age2);
		System.out.println(m.age3);
	}

}
