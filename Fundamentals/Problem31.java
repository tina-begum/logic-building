import java.util.Arrays;
import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input n and take n integers into an array and print them
        int n = sc.nextInt();
        int[] integerArr = new int[n];
        for (int i = 0; i < integerArr.length; i++) {
            integerArr[i] = sc.nextInt();
        }

        for (int i = 0; i < integerArr.length; i++) {
            System.out.print(integerArr[i] + " ");
        }

        System.out.println();

        for (int i : integerArr) {
            System.out.print(i + " ");
        }

        System.out.println();
        
        System.out.println(Arrays.toString(integerArr));
        sc.close();

    }
}
