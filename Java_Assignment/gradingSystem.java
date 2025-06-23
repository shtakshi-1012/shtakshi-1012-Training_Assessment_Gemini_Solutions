import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, marks;

        // calculating total marks
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        double percentage = total / 5.0;
        char grade;

        // converting percentage to grade
        if (percentage >= 90 && percentage <= 100) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);
    }
}
