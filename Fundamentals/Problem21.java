import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Count the number of digits in the given number
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        System.out.println("Number of digits: " + count);

        //Print the reverse of a given number and check if it is palindrome or not
        int num = sc.nextInt();
        int originalNumber = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
        if (originalNumber == rev) {
            System.out.println(originalNumber + " is Palindrome.");
        }
        sc.close();
    }
}