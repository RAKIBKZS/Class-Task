import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side length: ");
        double arm = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(arm,2);

        System.out.println("Area : " + area);
    }
}
