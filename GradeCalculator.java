import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 0 && marks <= 39) {
            grade = "F";
        } else if (marks >= 40 && marks <= 59) {
            grade = "C+";
        } else if (marks >= 60 && marks <= 69) {
            grade = "B";
        } else if (marks >= 70 && marks <= 79) {
            grade = "A-";
        } else if (marks >= 80 && marks <= 89) {
            grade = "A";
        } else if (marks >= 90) {
            grade = "A+";
        } else {
            grade = "Invalid input ";
        }

        System.out.println("Your grade : " + grade);
    }
}
