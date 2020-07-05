package package2;

import SQL.JDBC.Modifiers;

public class Modifiers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers m = new Modifiers();
		//System.out.println(m.age);				// Not visible as it is private. Only visible in same class.
		//System.out.println(m.age1);				// Not visible as it is protected.
		//System.out.println(m.age2);				// Not visible as it is default.
		System.out.println(m.age3);		
		
		
		// Use public when we want to access from anywhere in program
		
	}

}
