import java.util.Scanner;
import java.util.Arrays;

public class Lab01q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array1: ");
        int numElements = input.nextInt();
        double array1[] = new double[numElements];
        for (int i = 0; i < numElements; i++) {
            array1[i] = input.nextDouble();
        }
        System.out.println();
        System.out.print("Enter array2: ");
        numElements = input.nextInt();
        double array2[] = new double[numElements];
        for (int i = 0; i < numElements; i++) {
            array2[i] = input.nextDouble();
        }
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        System.out.println("Merged array: " + Arrays.toString(merge(array1, array2)));
    }
    public static double[] merge(double[] array1, double[] array2) {
        double[] finalArr = new double[array1.length + array2.length];
        System.arraycopy(array1, 0, finalArr, 0, array1.length);
        System.arraycopy(array2, 0, finalArr, array1.length, array2.length);
        return finalArr;
    }
}