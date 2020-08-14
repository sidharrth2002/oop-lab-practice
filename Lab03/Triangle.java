import java.util.ArrayList;
import java.util.Scanner;

class Triangle {
    private Point points[] = new Point[3];
    private double perimeter;
    public Triangle() {
        this(new Point(), new Point(), new Point());
    }
    public Triangle(Point p1, Point p2, Point p3) {
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        calcPerimeter();
    }
    private void calcPerimeter() {
        double p1p2, p2p3, p1p3;
        p1p2 = points[0].distance(points[1]);
        p2p3 = points[1].distance(points[2]);
        p1p3 = points[2].distance(points[0]);
        this.perimeter = p1p2 + p2p3 + p1p3;
    }
    public String toString() {
        return ("Points " + points[0].toString() + " " + points[1].toString() + " " + points[2].toString() + ". Perimeter: " + this.perimeter);
    }
    public static void main(String[] args) {
        int input_x, input_y;
        ArrayList<Point> points = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x and y (negative to exit): ");
        input_x = input.nextInt();
        input_y = input.nextInt();
        while (input_x != -1 && input_y != -1) {
            Point point = new Point(input_x, input_y);
            points.add(point);
            System.out.print("Enter x and y (negative to exit): ");
            input_x = input.nextInt();
            if (input_x < 0) {
                break;
            }
            input_y = input.nextInt();
        }
        for (int i=0; i<points.size(); ++i) {
            System.out.println(i + " " + points.get(i));
        }

        System.out.print("Select 3 indexes to form a triangle (negative to exit): ");
        int index_input = input.nextInt();
        int indices[] = new int[3];
        int count = 1;
        while (index_input != -1) {
            indices[count] = index_input;
            index_input = input.nextInt();
            count++;
            if (count == 3) {
                Triangle newTriangle = new Triangle(points.get(indices[0]), points.get(indices[1]), points.get(indices[2]));
                System.out.println(newTriangle);
                count = 0;
                indices = new int[3];
                System.out.print("Select 3 indexes to form a triangle (negative to exit): ");
            }
        } 

    }
}