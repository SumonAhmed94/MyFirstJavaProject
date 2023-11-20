package dataType;

public class StringDataType {

	public static void main(String[] args) {
		
		/*
		 * build full name
		 */
		
		String firstName="Sumon";
		String lastName="Ahmed";
		String fullName=firstName+lastName;
		System.out.println(fullName);
		
		
		String familyName="Ahmed";
		System.out.println("My Family Name is " +familyName);
		String nickName="Ab12$";
		System.out.println("My Nick Name is " +nickName);
		String fullName1=familyName+" "+nickName;
		System.out.println("My Full Name is " +fullName1);
		
		
		
		
		
		//compiler dosen't know how long this Sumon is
	}

}
