import java.util.Scanner;

/**
 * AnalyzeNumbers
 */
public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        
        double[] numbers = new double[n];

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }
        
        printArray(numbers);
        System.out.println("Maximum number is " + findMax(numbers));
        System.out.println("Minimum number is " + findMin(numbers));

        input.close();

    }
    public static void printArray(double[] array) {

        System.out.print("Show all the numbers in array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
    public static double findMax(double[] numbers) {

        int i;
        double max = numbers[0];
        
        for (i = 1; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];
        
        return max;

    }
    public static double findMin(double[] numbers) {

        int i;
        double min = numbers[0];
        
        for (i = 1; i < numbers.length; i++)
            if (numbers[i] < min)
                min = numbers[i];
        
        return min;

    }
    
}