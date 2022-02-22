import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Score: ");
        int score = input.nextInt();
        input.close();

        // Test the score if over or equal 80
        if (score >= 80)
        System.out.println("You are pass");

        // the score is not over or equal 80
        else
        System.out.println("You are fail");
    }
}
