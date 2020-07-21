import java.util.Scanner;

public class Lab00 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        
        int[] A = new int[size];
        System.out.print("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            A[i] = input.nextInt();
        }
        System.out.println("You entered: ");
        for (int i = 0; i < size; i++) {
            System.out.println(A[i]);
        }
        System.out.println("\n");

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += A[i];
        }
        System.out.println("Sum of array = " + sum);
    }
}