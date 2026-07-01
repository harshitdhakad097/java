package Questions;

import java.util.Scanner;

public class functions_ethods {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int m3 = in.nextInt();

        int total = totalMarks(m1, m2, m3);
        double average = percentage(total);
        char grade = finalGrade((int) average);

        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + average);
        System.out.println("Grade = " + grade);
    }

    static int totalMarks(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    static int percentage(int total) {
        return total/ 3;
    }

    static char finalGrade(int average) {

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }
}