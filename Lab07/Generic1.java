import java.util.ArrayList;
import java.util.Scanner;

public class Generic1 {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E value: list) {
            if (!result.contains(value))
                result.add(value);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println("Enter 6 integers with duplication: ");

        for (int i = 0; i < 6; i++) {
            intList.add(input.nextInt());
        }

        System.out.println("Original list : " + intList);
        System.out.println("Unique elements: " + removeDuplicates(intList));
    }
}
