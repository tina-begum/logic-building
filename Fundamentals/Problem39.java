import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Count how many times a given element appears 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input a number: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        System.out.println("How many times the number appears in the array? " + count);
        sc.close();
    }
}
