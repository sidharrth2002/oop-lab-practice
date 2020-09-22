import java.util.Stack;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Stack<Integer> tower1 = new Stack<>(); 
        tower1.push(1);
        tower1.push(2);
        tower1.push(3);
        tower1.push(4);

        System.out.println(tower1);

        tower1.push(10);

        System.out.println(tower1);

        System.out.println(tower1.pop());
        // Stack<Integer> tower2 = new Stack<>();
        // Stack<Integer> tower3 = new Stack<>();

        // int toMove = tower1.pop();
        // tower2.push(toMove);

        // System.out.println(tower1);
        // System.out.println(tower2);
    }
}
