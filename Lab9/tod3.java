public class tod3 {
    public static void main(String[] args) {
        int num = 1;
        int i = 0;
        do {
            num = num + 2;
            if (num%2==0) {
                num = num+1;
                i++;
            }
        } while (i<20);
        System.out.println(num);
    }
}
