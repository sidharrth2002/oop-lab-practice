import java.util.Random;

public class TestArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> randomIntegers = new MyArrayList<>();
        Random r = new Random();

        randomIntegers.add(10);
        randomIntegers.add(20);
        randomIntegers.add(30);

        // System.out.println(randomIntegers.indexOf(20));

        // randomIntegers.remove((Integer)0);

        // randomIntegers.remove((Integer)10);

        System.out.println(randomIntegers);

        randomIntegers.set(0, 100);

        // randomIntegers.clear();

        System.out.println(randomIntegers);

    }
}
