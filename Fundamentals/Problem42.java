import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Check if all elements in an array are unique
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean areUnique = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    areUnique = false;
                    break;
                }
            }
        }
        System.out.println("Are all elements in the array unique? " + areUnique);
        sc.close();
    }
}
