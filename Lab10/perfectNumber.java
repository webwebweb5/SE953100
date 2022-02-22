import java.util.Scanner;

public class perfectNumber {
    public static Boolean isPerfect(int num){

        int sum = 0;

        /* การหา perfect number ตัวที่หาร perfect number ลงตัว 
        จะต้องไม่รวมตัวมันเอง จึงต้องหาตั้งแต่ 1 - ตัวมันเองหาร 2
        Ex. 6 = 3 + 2 + 1 เราไม่รวมตัวมันเองจึงมีแค่ 3, 2, 1 */

        for (int i = 1; i <= num / 2; i++) {
            //หาตัวที่หาร perfect number ลงตัว -> 3, 2, 1
            if (num%i == 0) {
                //นำตัวที่หารลงตัวมาบวกกัน -> 1 + 2 + 3
                sum += i;
            }
        }
        //เช็คว่าผลรวมของตัวที่หารลงตัว เท่ากันกับค่าที่เรากำลังหาหรือไม่
        // 1 + 2 + 3 = 6?
        if (sum == num) {
            return true;
        } else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();
        input.close();

        boolean answer = isPerfect(num);
        System.out.println(answer);

    }
}
