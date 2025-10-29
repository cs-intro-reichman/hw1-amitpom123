// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int x = 548;
		int Hundreds = x / 100;
		int Tens = (x % 100) / 10;
		int Ones = x % 10;
		System.out.println("Hundreds is" + " " + Hundreds);
		System.out.println("Tens is" + " " + Tens);
		System.out.println("Ones is" + " " + Ones);
	}
}
