// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		int c = (int)(Math.random() * 100);
		int x = Math.min(a, b);
		int min = Math.min(x, c);
		int y = Math.max(a, b);
		int max = Math.max(y, c);
		int middle = (a+b+c-max-min);
		System.out.println(max + " " + middle + " " + min);
	}
}
