import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Find the last occurence of a given number
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index++;
            }
        }
        System.out.println("Last occurence of the number: " + index);
        sc.close();
    }
}
