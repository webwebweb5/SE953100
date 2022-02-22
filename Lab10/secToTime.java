import java.util.Scanner;

public class secToTime {
    public static String convertMillis(long millis){
        long sec, hour, min, remainingSec, remainingMin;

        sec = millis / 1000;

        min = sec / 60;
		remainingSec = sec % 60;
		hour = min / 60;
		remainingMin = min % 60;

        String numberString = String.valueOf(hour);
        String numberString2 = String.valueOf(remainingSec);
        String numberString3 = String.valueOf(remainingMin);

        return numberString + ":" + numberString2 + ":" + numberString3;
        
    }
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Second: ");
		long millisec = input.nextInt();
        input.close();

        String time = convertMillis(millisec);

        System.out.println(time);

    }
}
