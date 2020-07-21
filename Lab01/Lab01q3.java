import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab01q3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (0 to finish): ");
        int inputElement = input.nextInt();
        while (inputElement != 0)  {
            list.add(inputElement);
            inputElement = input.nextInt();
        }
        removeDuplicate(list);
        System.out.println("The distinct integers are " + list);
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> UniqueList = new ArrayList<Integer>();
        for (int element: list) {
            if (!UniqueList.contains(element)) {
                UniqueList.add(element);
            }
        }
        list.clear();
        for (int element: UniqueList) {
            list.add(element);
        }
    }
}

// int element = list.get(i);
// flag = false;
// for (int j = 0; j < list.size() - (i+1); j++) {
//     if (element == list.get(j)) {
//         flag = true;
//     }
// }
// if (!flag) {
//     UniqueList.add(element);
// }