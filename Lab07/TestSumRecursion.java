import java.util.Scanner;

public class TestSumRecursion {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n = n/10;
        }
        return sum;
    }

    public static long sumDigitsRecursive(long n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10 + sumDigitsRecursive(n/10));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long inputInteger = input.nextLong();
        System.out.println("(Non-recursive) The sum of digits in 123456 is " + sumDigits(inputInteger));
        System.out.println("(Recursive) The sum of digits in 123456 is " + sumDigitsRecursive(inputInteger));
    }
}