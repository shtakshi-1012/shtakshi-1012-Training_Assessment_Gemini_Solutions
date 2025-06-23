import java.util.Scanner;

public class simpleCompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        // calculating simpleInterest
        double simpleInterest = (principal * rate * time) / 100;
        // calculatingCompoundInterest
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Compound Interest = " + compoundInterest);
    }
}
