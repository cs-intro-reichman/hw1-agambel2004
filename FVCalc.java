// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String principal = args[0];
		String insertRate = args[1];
		String time = args[2];

		int currentValue = Integer.parseInt(principal);
		double rate = Double.parseDouble(insertRate)/100;
		int year = Integer.parseInt(time);

		double futureValue = currentValue * Math.pow(rate + 1, year);
		
		System.out.println("after " + year + ", $" + currentValue + 
		" saved at " + insertRate + "% will yield $" +(int)futureValue);
	}
}