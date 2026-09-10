import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Find the sum of even elements only
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even elements: " + sum);
        sc.close();
    }
}
