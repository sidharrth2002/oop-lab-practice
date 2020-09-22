import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Occurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        Map<Character, Integer> originalOrder = new LinkedHashMap<>();
        // Map<Character, Integer> ascendingOrder = new TreeMap<>();

        for (int i = 0; i<sentence.length(); i++) {
            Character letter = Character.toLowerCase(sentence.charAt(i));
            if (!originalOrder.containsKey(letter)) {
                originalOrder.put(letter, 1);
                // ascendingOrder.put(letter, 1);
            } else {
                int value = originalOrder.get(letter);
                value+=1;
                originalOrder.put(letter, value);
                // ascendingOrder.put(letter, value);
            }
        }

        originalOrder.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        System.out.println();
        System.out.println();

        Map<Character, Integer> ascendingOrder = new TreeMap<>(originalOrder);

        ascendingOrder.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
        
    }
}