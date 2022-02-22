import java.util.Scanner;

public class compareNumber {
    public static void main(String[] args) {

        double num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        num1 = input.nextDouble();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextDouble();
        input.close();

        if (num1 > num2) {
            System.out.println("The first number is greater than the second");
        } else if (num1 < num2) {
            System.out.println("The first number is NO greater than the second");
        } else {
            System.out.println("These two numbers are equal");
        }
    }
}
