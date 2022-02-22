import java.util.Scanner;

public class convertTemp {
    
    public static void main(String[] args) {

        double c, f;
        char choice;

        Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature °C or °F (type C or F): ");
		choice = input.next().charAt(0);
        char choices = Character.toUpperCase(choice);
		
		if (choices == 'C') {

            System.out.print("Enter temperature °C : ");
            c = input.nextDouble();
            f = (9*c)/5+32;
            System.out.printf("%.2f",f);
            System.out.print(" °F");
        } else if (choices == 'F') {

            System.out.print("Enter temperature °F : ");
            f = input.nextDouble();
            c = (f-32)*(0.56);
            System.out.printf("%.2f",c);
            System.out.print(" °C");

        } else {

            System.out.print("You've entered an invalid character.");

        }

        input.close();

    }
}