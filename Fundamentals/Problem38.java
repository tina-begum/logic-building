import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input a number x and check if it exists in the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input a number: ");
        int x = sc.nextInt();
        boolean found = false;
        for (int i : arr) {
            if (i == x) {
                found = true;
                break;
            }
        }
        System.out.println("Does the number exists in the array? " + found);
        sc.close();
    }
}