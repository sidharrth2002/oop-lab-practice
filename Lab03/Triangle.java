import java.util.ArrayList;
import java.util.Scanner;

class Triangle {
    private Point points[3];
    private double perimeter;
    public Triangle() {
        this(0, 0);
    }
    public Triangle(Point p1, Point p2, Point p3) {
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
    }
    private void calcPerimeter() {
        double p1p2, p2p3, p1p3;
        p1p2 = points[0].distance(points[1]);
        p2p3 = points[1].distance(points[2]);
        p1p3 = points[2].distance(points[0]);
        this.perimeter = p1p2 + p2p3 + p1p3;
    }
    public String toString() {
        return ("Points " + points[0].toString() + " " + points[1].toString() + " " + points[2].toString() + ". " + "Perimeter = " + this.perimeter);
    }
    public static void main(String[] args) {
        int input_x, input_y;
        ArrayList<Point> points = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x and y (negative to exit): ");
        input_x = input.nextInt();
        input_y = input.nextInt();
        while (input_x > 0 && input_y > 0) {
            ArrayList.add(Point(input_x, input_y));
            System.out.print("Enter x and y (negative to exit): ");
            input_x = input.nextInt();
            input_y = input.nextInt();
        }
        
        System.out.println(points);
        
        // System.out.println("Select 3 indexes to form a triangle (negative t");
    }
    
}