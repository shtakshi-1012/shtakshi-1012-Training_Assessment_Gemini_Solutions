import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int max = a;
        // comparing the numbers
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Greatest number is: " + max);
    }
}
