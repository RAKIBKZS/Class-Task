public class OddEvenCounter {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 8, 11, 14, 17, 20, 23};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
             else {
                oddCount++;
            }
        }

        System.out.println("Total numbers: " + numbers.length);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
