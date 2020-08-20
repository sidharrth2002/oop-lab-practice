public class ThrowingException {
    public class Rectangle {
        private double width = 1, height = 1;
        private static int numberOfRectangles = 0;
        public Rectangle() {
        numberOfRectangles++;
        }
        public Rectangle(double width, double height) {
        setWidth (width);
        setHeight (height);
        numberOfRectangles++;
        }
        public void setWidth (double width) {
        this.width = width;
        }
        public void setHeight (double height) {
        this.height = height;
        }
        public double getArea() {
        return width * height;
        }
        public static int getNumberOfRectangles() {
        2
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
        System.out.println ("Change r1's height to -2");
        r1.setHeight (-2);
        System.out.println ("r1 area = " + r1.getArea());
        System.out.println ("Create r2, width = -3, height = 4");
        Rectangle r2 = new Rectangle (-3,4);
        System.out.println ("r2 area = " + r2.getArea());
        System.out.println ("Rectangle count = " +
        Rectangle.getNumberOfRectangles());
        }
        }
        Current sample run:
        Rectangle count = 0
        Create r1, width = 1, height = 2
        r1 area = 2.0
        Change r1's height to -2
        r1 area = -2.0
        Create r2, width = -3, height = 4
        r2 area = -12.0
        Rectangle count = 2
}