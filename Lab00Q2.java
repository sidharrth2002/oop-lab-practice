import java.util.Scanner;
import java.util.ArrayList;

public class Lab00Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList <String> words = new ArrayList <String>();
        String word = new String();
        System.out.print("Enter 4 words: ");
        for (int i=0; i<4; ++i) {
            word = input.next();
            words.add(word);
        }
        boolean ascending = true;
        boolean duplicate = false;
        String el1, el2;
        for (int i=0; i<3; i++) {
            el1 = words.get(i);
            el2 = words.get(i + 1);
            if(el1.compareTo(el2) > 0) {
                ascending = false;
            }
            for (int j=i+1; j<4; j++) {
                if (el1.equals(words.get(j))) {
                    duplicate = true;
                }
            }  
        }
        if (ascending) {
            System.out.println("Words in ascending order");
        } else {
            System.out.println("Words not in ascending order");
        }
        if (duplicate) {
            System.out.println("Got duplicated words");
        } else {
            System.out.println("No duplicated words");
        }
    }
}