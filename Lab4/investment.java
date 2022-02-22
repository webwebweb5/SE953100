import java.util.Scanner;

public class investment {

	public static void main(String[] args) {
		
		double amount;
		int year;
		double FIV; //future investment value
		double increase;
		double interestRateRaw;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount: ");
		amount = input.nextDouble();
		System.out.print("Enter interest rate: ");
		interestRateRaw = input.nextDouble();
		System.out.print("Enter number of year: ");
		year = input.nextInt();
		input.close();
		
		double interestRate = interestRateRaw/100;
		
		FIV = amount * Math.pow((1 + interestRate), year);
		increase = FIV - amount;
		System.out.println("Amount: " + amount);
		System.out.println("Interest rate: " + interestRateRaw + "%");
		System.out.println("Number of year: " + year);
		System.out.printf("Future investment value is " + "%.2f",FIV);
		System.out.println();
		System.out.printf("increase: " + "%.2f",increase);
	}

}
