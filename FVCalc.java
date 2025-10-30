// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double intrest = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);
		double futureValue =  currentValue * Math.pow((1 + (intrest / 100)), years);
		System.out.println("After " + (int)years + " years, " + "$" + currentValue + " saved at " + intrest + "% " + "will yield " + "$" + (int)futureValue);
	}
}