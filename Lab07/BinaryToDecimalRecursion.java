public class BinaryToDecimalRecursion {
    
    public static int binaryToDecimal (String binaryString) {
        return binaryToDecimal(binaryString, binaryString.length() - 1);
    }
    
    public static int binaryToDecimal (String binaryString, int power) {

        if (power < 0) {
            return 0;
        } else {
            int currentDigit = binaryString.charAt(binaryString.length() - 1 - power) - '0';
            return currentDigit * (int)Math.pow(2, power) + binaryToDecimal(binaryString, power - 1);
        
        }


        // if (position == binaryString.length() - 1) {
        //     return binaryString.charAt(position) - '0';
        // }

        // return (binaryString.charAt(position) - '0') << (binaryString.length() - position - 1) + binaryToDecimal(binaryString, position + 1);
    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("10101010101010101011"));
    }

}

