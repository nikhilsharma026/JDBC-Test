package SQL.JDBC;

public class Modifiers5 extends Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modifiers5 m = new Modifiers5();
		//System.out.println(m.age);				// Not visible as it is private. Only visible in same class. Use private when we want access limited to same class only.
		System.out.println(m.age1);
		System.out.println(m.age2);
		System.out.println(m.age3);
		
		
		
		// Default members can be accessed in child classes only when child classes are in same package.If package is different then default member not visinle
		
		// Protected members can be accessed in child classes in both conditions when child classes are in same package or different.
		
	}

}
