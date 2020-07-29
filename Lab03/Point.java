import java.math.*;
import java.util.Scanner;

public class Point {
    int x = 0;
    int y = 0;
    Point() {}
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double distance(Point p) {
        double y_dist = this.y - p.y;
        double x_dist = this.x - p.x;
        double distance = Math.sqrt(Math.pow(y_dist, 2) + Math.pow(x_dist, 2));
        return distance;
    }
    public String toString() {
        return ("(" + this.x + "," + this.y + ")");
    }
    public static void main(String[] args) {
        int point1_x, point1_y, point2_x, point2_y;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x and y: ");
        point1_x = input.nextInt();
        point1_y = input.nextInt();

        System.out.print("Enter x and y: ");
        point2_x = input.nextInt();
        point2_y = input.nextInt();

        Point point1 = new Point(point1_x, point1_y);
        Point point2 = new Point(point2_x, point2_y);

        System.out.println("2 points: " + point1.toString() + " " + point2.toString());
        System.out.println("Distance = " + point1.distance(point2));
        input.close();
    }
}