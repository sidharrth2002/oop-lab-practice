import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> randomList = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i<10; i++) {
            randomList.add(i);
        }
        System.out.println(randomList);
        Collections.sort(randomList);
        System.out.println(randomList);
        Collections.shuffle(randomList);
        System.out.println(randomList);
        Collections.sort(randomList, Collections.reverseOrder());
        System.out.println(randomList);
        
    }
}
