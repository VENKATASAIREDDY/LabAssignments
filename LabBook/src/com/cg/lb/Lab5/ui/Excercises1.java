package lab5;
import java.util.Scanner;
class AgeException extends Exception{
	public String toString() {
		return "Age is less than 15";
	}
}


public class Excercises1 {
	public static void main(String[] args) throws AgeException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number=scan.nextInt();
		try {
		if(number<15)
			throw new AgeException();
		}
		catch(AgeException e) {
			System.out.println(e);
		}
	}
}
