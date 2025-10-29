// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];      //last name to print
	    String name2 = args[1];      //second name to print
		String name3 = args[2];      //first name to print
		int sum = Integer.parseInt(args[3]);     //the bill
		double x = (double)sum / 3;                      //the bill is now div. by 3
		x = Math.ceil(x);                        //rounding up as asked
		System.out.println("Dear" + " " + name3 + "," + " " + name2 + "," + " " + "and" + " " + name1 + ":" + " pay" + " " + x + " Shekels each.");
	}
}
