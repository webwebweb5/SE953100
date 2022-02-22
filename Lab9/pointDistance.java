import java.util.Scanner;

public class pointDistance {
    public static int formula(int x1, int x2, int y1, int y2) {
        
        double result = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

        System.out.println("Distance is " + result);
        return (int) result;
    }
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 : ");
        x1 = input.nextInt();
        System.out.print("Enter x2 : ");
        x2 = input.nextInt();
        System.out.print("Enter y1 : ");
        y1 = input.nextInt();
        System.out.print("Enter y2 : ");
        y2 = input.nextInt();

        formula(x1, x2, y1, y2);

        input.close();
    }
}
