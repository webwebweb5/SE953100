import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hour : ");
		int hour = input.nextInt();
        input.close();
		
		double receives;
		double OT;
        double limitTime;
		
		//receives = hour * 8;
		//OT = receives + 12;
        //limitTime = 40 * 8;
        //OT = limitTime + ((hour - 40) * 12);
		
		if (hour <= 40) {
            receives = hour * 8;
			System.out.print("Recieves : $" + receives);
		} else {
            limitTime = 40 * 8;
            OT = limitTime + ((hour - 40) * 12);
			System.out.print("Weekly salary is: $" + OT);
		}

	}

}