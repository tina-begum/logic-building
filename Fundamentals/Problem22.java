import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        
        int originalNumber = num;
        int sum = 0;
        while (num > 0) {
            sum +=  (int)(Math.pow((num % 10), count));
            num /= 10;
        }
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is Armstrong number.");
        }
        sc.close();
    }
}
