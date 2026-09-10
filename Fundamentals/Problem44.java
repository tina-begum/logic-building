import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Find sum of odd elements only
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd elements : " + sum);
        sc.close();
    }
}
