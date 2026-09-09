import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Count how many elements are positive, negative, or zero.
        int countPositive = 0, countNegative = 0, countZero = 0;
        for (int i : arr) {
            if (i > 0) {
                countPositive++;
            } else if (i < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("Number of Positive elements: " + countPositive);
        System.out.println("Number of Negative elements in the array: " + countNegative);
        System.out.println("Number of zeroes in the array: " + countZero);
        sc.close();
    }
}
