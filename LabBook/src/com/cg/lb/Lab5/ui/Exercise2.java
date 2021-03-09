package lab5;

import java.util.Scanner;

class NameException extends Exception{
	public String toString() {
		return "Invalid Name";
	}
}

public class Exercise2 {

	public static void main(String[] args) throws NameException {
		Scanner scan=new Scanner(System.in);
		//System.out.println("Enter First name: ");
		String firstName=new String();
		//System.out.println("Enter Last name: ");
		String lastname="Hello";
		
		try {
			if(firstName.isEmpty()|| lastname.isEmpty())
				throw new NameException();
		}
		catch(NameException e) {
			System.out.println(e);
		}

	}

}
