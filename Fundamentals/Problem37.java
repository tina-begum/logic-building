import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take n elements and print only those greater than a given value k.
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i : arr) {
            if (i > k) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
