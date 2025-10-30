// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int x = Integer.parseInt(args[0]);
		int Hundreds = x / 100;
		int Tens = (x % 100) / 10;
		int Ones = x % 10;
		System.out.println(Hundreds + " " + "hundreds" + ", " + Tens + " " + "tens" + "," + " and " + Ones + " " + "ones.");
	}
}
