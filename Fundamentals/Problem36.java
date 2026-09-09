import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Find the index of the maximum element.
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxIndex = i;
            }
        }
        System.out.println("Index of the maximum element: " + maxIndex);
        //Find the index of the minimum element.
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                minIndex = i;
            }
        }
        System.out.println("Index of the minimum element: " + minIndex);
        sc.close();
    }
}
