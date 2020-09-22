import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (0 to end): ");
        int num;
        
        Set<Integer> numbers = new TreeSet<>();
        Set<Integer> numbers2 = new LinkedHashSet<>();

        num = input.nextInt();
        do {
            numbers.add(num);
            numbers2.add(num);
            num = input.nextInt();
        } while (num != 0);
        System.out.println(numbers);
        System.out.println(numbers2);
    }
}