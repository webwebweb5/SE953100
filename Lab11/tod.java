import java.util.Scanner;

/**
 * AnalyzeNumbers
 */
public class tod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        System.out.println(sum);
        
        double avg = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > avg) {
                count++;
            }
        }

        System.out.println(avg);
        System.out.println(count);
        input.close();

    }
    
}
