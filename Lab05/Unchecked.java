import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Unchecked {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, index1, index2;
        index1 = index2 = 0;
        System.out.print("Enter array size: ");
        length = input.nextInt();

        int randomNumbers[] = new int[length];
        
        Random r = new Random();
        
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = r.nextInt(101);
            System.out.println(randomNumbers[i]);
        }

        int total;
        do {
            try {
                System.out.println("Enter 2 indexes to sum (negative to exit): ");
                index1 = input.nextInt();
                if (index1 == -1) {
                    break;
                }
                index2 = input.nextInt();
                if (index1 == -1) {
                    break;
                }
                total = randomNumbers[index1] + randomNumbers[index2];
                System.out.println(randomNumbers[index1] + " + " + randomNumbers[index2] + " = " + total);
            } catch (InputMismatchException ex) {
                System.out.println("Input Error: 2 positive integers are required.");
                input.next();
                continue;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Input Error: Invalid array index(s).");
                // input.next();
                continue;
            }
        } while (true);
}
}