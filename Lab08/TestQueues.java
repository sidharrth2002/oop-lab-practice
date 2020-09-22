import java.util.*;
class Task implements Comparable<Task> {
    private int priority;
    private String name;
    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
    public String toString() {
        return "Task <priority=" + priority + " name=" + name + ">";
    }

    @Override
    public int compareTo(Task t1) {
        if (priority == t1.priority)
            return 0;
        else if (priority > t1.priority)
            return 1;
        else
            return -1;
    }
    
}

public class TestQueues {
    public static void main (String[] args) {
        // PriorityQueue<Integer> intPQ = new PriorityQueue<>(Collections.reverseOrder());
        // intPQ.add (40);
        // intPQ.add (60);
        // intPQ.add (20);
        // while (!intPQ.isEmpty())
        //     System.out.println ("Removed from PriorityQueue<Integer>: " +
        //     intPQ.poll());

        Queue<Task> tasks = new LinkedList<>();
        tasks.add(new Task(3, "Eat"));
        tasks.add(new Task(8, "Sleep"));
        tasks.add(new Task(1, "Study"));

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }

        PriorityQueue<Task> tasksWithPriority = new PriorityQueue<Task>();
        tasksWithPriority.add(new Task(3, "Eat"));
        tasksWithPriority.add(new Task(8, "Sleep"));
        tasksWithPriority.add(new Task(1, "Study"));
        
        while (!tasksWithPriority.isEmpty()) {
            System.out.println(tasksWithPriority.poll());
        }
    }
}