import java.util.Scanner;

public class MedalProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade : ");
        double grade = sc.nextDouble();

        boolean completed = sc.nextBoolean();

        if (completed) {
            if (grade >= 3.5) {
                System.out.println("Student gets a medal!");
            } 
            else {
                System.out.println("Student does not qualify for a medal.");
            }
        }
         else {
            System.out.println("Student has not completed the semester.");
        }
    }
}
