/**
 * convertMileKilo
 */
public class convertMileKilo {
    public static double mileTokilometer(double mile) {
        double kilometer = mile * 1.6;
        return kilometer;
    }
    public static double kilometerToMile(double kilometer) {
        double mile = kilometer / 1.6;
        return mile;
    }
    public static void space(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
    }
    public static void spaceMid(int space) {
        for (int i = 0; i < space; i++) {
            if (i == space / 2) {
                System.out.print("|");
            }
            System.out.print(" ");
        }
    }

    public static void headTable() {
        System.out.print("Miles");
        space(11);
        System.out.print("Kilometers");
        spaceMid(12);
        System.out.print("Kilometers");
        space(11);
        System.out.print("Miles");
        System.out.println();
    }
    public static void main(String[] args) {
        headTable();
        for (int i = 0; i < 33; i++) {
            System.out.print("--");
        }
        System.out.println();
        double mile;
        double kilometer;
        int j = 15;

        for (int i = 1; i <= 10; i++) {
            System.out.print((double) i);
            if (i < 7) {
                space(15);
            } else if (i < 10) {
                space(14);
            } else {
                space(13);
            }
            kilometer = mileTokilometer(i);
            System.out.printf("%.2f",kilometer);

            spaceMid(20);

            j += 5;
            System.out.print((double) j);
            space(13);
            mile = kilometerToMile(j);
            System.out.printf("%.2f",mile);

            System.out.println();
    
        }
    }
}