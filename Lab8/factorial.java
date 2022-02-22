import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int factorial = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter factorial: ");
        int number = input.nextInt();
        input.close();

        System.out.print(number + "!" + " = ");
        for (int i = number; i >= 1; i--) {
            factorial *= i;
            if (i > 1) {
                System.out.print(i + " x ");
            } else if (i == 1) {
                System.out.print(i);
            } 
        }
        System.out.print(" = " + factorial);

    }
}
