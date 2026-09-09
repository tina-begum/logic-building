import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Count number of even or odd elements
        int countEven = 0, countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Number of even elements in the array: " + countEven);
        System.out.println("Number of odd elements in the array: " + countOdd);
        sc.close();
    }
}
