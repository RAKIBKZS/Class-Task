import java.util.Scanner;

public class PositiveIntegerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println(num + " is a positive integer.");
            }
             else {
                System.out.println(num + " is NOT a positive integer.");
            }
        } 
        else {
            System.out.println("Input is NOT an integer.");
        }
    }
}
