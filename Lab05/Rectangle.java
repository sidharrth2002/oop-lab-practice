public class Rectangle {
    private double width = 1, height = 1;

    private static int numberOfRectangles = 0;

    public Rectangle() {
        numberOfRectangles++;
    }

    public Rectangle(double width, double height) {
        try {
            setWidth (width);
            setHeight (height);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        numberOfRectangles++;
    }

    public void setWidth (double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Input Error: Width must be positive");
        }
        this.width = width;
    }
    

    public void setHeight (double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Input Error: Height must be positive");
        }
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public static int getNumberOfRectangles() {
        return numberOfRectangles;
    }
}

class TestRectangle {
    public static void main (String[] args) {
        System.out.println ("Rectangle count = " +
        Rectangle.getNumberOfRectangles());
        System.out.println ("Create r1, width = 1, height = 2");
        Rectangle r1 = new Rectangle (1,2);
        System.out.println ("r1 area = " + r1.getArea());
        try {
            System.out.println ("Change r1's height to -2");
            r1.setHeight (-2);
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println ("r1 area = " + r1.getArea());
        System.out.println ("Create r2, width = -3, height = 4");
        Rectangle r2 = new Rectangle (-3,4);
        System.out.println ("r2 area = " + r2.getArea());
        System.out.println ("Rectangle count = " +
        Rectangle.getNumberOfRectangles());
    }
}