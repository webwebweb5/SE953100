public class studentGrade {
    public static void main(String[] args) {
        int[] students = new int[100];
        char grade;
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = (int)(Math.random() * 101);
        }

        for (int i = 0; i < students.length; i++) {
            grade = grading(students[i]);
            if (grade == 'A') {
                A++;
            } else if (grade == 'B') {
                B++;
            } else if (grade == 'C') {
                C++;
            } else if (grade == 'D') {
                D++;
            } else {
                F++;
            }
        }

        System.out.println("Student got A >> " + A);
        System.out.println("Student got B >> " + B);
        System.out.println("Student got C >> " + C);
        System.out.println("Student got D >> " + D);
        System.out.println("Student got F >> " + F);
        System.out.println("Total student >> " + students.length);
    }
    public static char grading(int studentscore) {

        char gpa;

        if (studentscore >= 80 && studentscore <= 100) {
            gpa = 'A';
        } else if (studentscore >= 70) {
            gpa = 'B';
        } else if (studentscore >= 60) {
            gpa = 'C';
        } else if (studentscore >= 50) {
            gpa = 'D';
        } else {
            gpa = 'F';
        }

        return gpa;

    }
}
