import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        char ch = sc.next().charAt(0);

        if (ch == '+') {
            System.out.println("Result = " + (a + b));
        }
        else if (ch == '-') {
            System.out.println("Result = " + (a - b));
        }
        else if (ch == '*') {
            System.out.println("Result = " + (a * b));
        }
        else if (ch == '/') {
            if (b != 0) {
                System.out.println("Result = " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        }
        else {
            System.out.println("Invalid operator!");
        }
    }
}