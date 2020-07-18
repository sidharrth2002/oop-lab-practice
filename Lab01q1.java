import java.util.Scanner;
import java.lang.*;

class Lab01q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = input.next();
        String finalNumber = "";
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (Character.isLetter(phoneNumber.charAt(i))) {
                int number = getNumber(phoneNumber.charAt(i));
                finalNumber += Integer.toString(number);
            } else {
                finalNumber += phoneNumber.charAt(i);
            }
        }
        System.out.println(finalNumber);
    }
    public static int getNumber(char letter) {
        char letterCheck = Character.toLowerCase(letter);
        int number = 0;
        switch (letterCheck) {
            case 'a':
            case 'b':
            case 'c':
                number = 2;
                break;
            case 'd':
            case 'e':
            case 'f':
                number = 3;
                break;
            case 'g':
            case 'h':
            case 'i':
                number = 4;
                break;
            case 'j':
            case 'k':
            case 'l':
                number = 5;
                break;
            case 'm':
            case 'n':
            case 'o':
                number = 6;
                break;
            case 'p': case 'q': case 'r': case 's':
                number = 7;
                break;
            case 't': case 'u': case 'v':
                number = 8;
                break;
            case 'w': case 'x': case 'y': case 'z':
                number = 9;
                break;
        }
        return number;
    }
}
