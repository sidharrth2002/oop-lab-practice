import java.util.Scanner;
import java.net.*; // URL, MalformedURLException
import java.io.IOException;
public class CheckWebpageLine {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);
        String URLString = input.next();
        try {
            int count = countWebpageLine (URLString);
            System.out.println("The webpage has " + count + " lines of codes.");
        } catch(MalformedURLException ex) {
            System.out.println("URL error: " + ex.getMessage());
        } catch(IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        } 
    }

    public static int countWebpageLine (String URLString) throws MalformedURLException, IOException {
        URL url = new URL (URLString);
        int count = 0;
        Scanner input = new Scanner(url.openStream());
        while (input.hasNext()) {
            String line = input.nextLine();
            count++;
        }
        return count;
    }
}