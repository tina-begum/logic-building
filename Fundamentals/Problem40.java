import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Find the first occurence of a given number
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Number found at index: " + i);
                break;
            }
        }
        sc.close();
    }
}
