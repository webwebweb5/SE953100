/**
 * tod
 */
public class tod {

    public static void main(String[] args) {
        
        int k = max(20,60,10,-50);
        
        System.out.println(k);
        
    }
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static int max(int num1, int num2, int num3, int num4) {

        return max(max(num1, num2), max(num3, num4));

    }
}