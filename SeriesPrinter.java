public class SeriesPrinter {
    public static void main(String[] args) {

        System.out.println("Even Series 2 to 20");

        // For-loop
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        // While-loop
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        // Do While-loop
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);

        System.out.println("Odd Series 1 to 19");

        // For-loop
        for (int j = 1; j <= 19; j += 2) {
            System.out.print(j + " ");
        }

        // While-loop
        int j = 1;
        while (j <= 19) {
            System.out.print(j + " ");
            j += 2;
        }

        // Do-while loop
        j = 1;
        do {
            System.out.print(j + " ");
            j += 2;
        } while (j <= 19);
    }
}
