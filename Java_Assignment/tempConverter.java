import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Centigrade: ");
        double celsius = sc.nextDouble();

        // converting temperature in celsius to fahrenheit 
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
