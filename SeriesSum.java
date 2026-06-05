public class SeriesSum {
    public static void main(String[] args) {

        // Even Series Sum
        int sumEvenFor = 0, sumEvenWhile = 0, sumEvenDo = 0;

        // For-loop
        for (int i = 2; i <= 20; i += 2) {
            sumEvenFor += i;
        }

        // While-loop
        int i = 2;
        while (i <= 20) {
            sumEvenWhile += i;
            i += 2;
        }

        // Do-while loop
        i = 2;
        do {
            sumEvenDo += i;
            i += 2;
        } while (i <= 20);

        // Odd Series Sum
        int sumOddFor = 0, sumOddWhile = 0, sumOddDo = 0;

        // For-loop
        for (int j = 1; j <= 19; j += 2) {
            sumOddFor += j;
        }

        // While-loop
        int j = 1;
        while (j <= 19) {
            sumOddWhile += j;
            j += 2;
        }

        // Do-while loop
        j = 1;
        do {
            sumOddDo += j;
            j += 2;
        } while (j <= 19);

        System.out.println("Sum of Even Series (2 to 20):");
        System.out.println("For-loop: " + sumEvenFor);
        System.out.println("While-loop: " + sumEvenWhile);
        System.out.println("Do-while loop: " + sumEvenDo);

        System.out.println("\nSum of Odd Series (1 to 19):");
        System.out.println("For-loop: " + sumOddFor);
        System.out.println("While-loop: " + sumOddWhile);
        System.out.println("Do-while loop: " + sumOddDo);
    }
}
