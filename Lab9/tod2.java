public class tod2 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        int num3 = 2;

        sort(num1, num2, num3);

    }
    public static void sort(int n1, int n2, int n3) {
        for (int i = 0; i < 3; i++) {
            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if (n2 > n3) {
                int temp = n2;
                n2 = n3;
                n3 = temp;
            }
        }
        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
