/**
 * QuestionC
 */
public class QuestionC {
    public static void head() {
        System.out.print("\t\tSu" + "\tM" + "\tT" + "\tW" + "\tTh" + "\tF" + "\tsa\n");
    }
    public static void main(String[] args) {

        head();

        int[][] hours = { 
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1}
        };

        for (int i = 0; i < hours.length; i++) {
            System.out.print("Employee " + i + "\t");
            for (int j = 0; j < hours[i].length; j++) {
                System.out.print(hours[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        int[] total = new int[4];
        int sum = 0;
        
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                total[i] += hours[i][j];
                sum = total[i];
            }
            System.out.println("Sum of hour work of employees "  + i + " in a week : " + sum);
            System.out.println();
        }
        
    }
}