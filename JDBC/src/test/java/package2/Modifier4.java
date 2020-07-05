package package2;

import SQL.JDBC.Modifiers;

public class Modifier4 extends Modifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modifier4 m= new Modifier4();
		
		//System.out.println(m.age);		//Not visible as private
		
		System.out.println(m.age1);		//Protected can be accessed from different package after extending.
		
		
		//System.out.println(m.age2);			//Not visible as default. It cant be accessed from different package after extending.
		
		
		System.out.println(m.age3);
	}

}
