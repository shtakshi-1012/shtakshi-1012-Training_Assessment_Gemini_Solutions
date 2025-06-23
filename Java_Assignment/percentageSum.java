import java.util.Scanner;

public class percentageSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int marks;

        // calculating total marks 
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        // calculating percentage
        double percentage = total / 5.0;
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}
