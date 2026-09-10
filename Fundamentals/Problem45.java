import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Find the count of prime numbers in the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i : arr) {
            int limit = (int)(Math.sqrt(i));
            boolean isPrime = true;
            for (int j = 2; j <= limit; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if ((isPrime) && (i > 1)) {
                count++;
            }
        }
        System.out.println("Number of prime numbers: " + count);
        sc.close();
    }
}
