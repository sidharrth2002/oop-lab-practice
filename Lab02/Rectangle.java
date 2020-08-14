public class Rectangle {
    private double width = 1;
    private double height = 1;
    private static int numberOfRectangles = 0;
    public Rectangle() {
        numberOfRectangles += 1;
    }
    public Rectangle(double recWidth, double recHeight) {
        width = recWidth;
        height = recHeight;
        numberOfRectangles++;
    } 
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double newHeight) {
        height = newHeight;
    }
    public void setWidth(double newWidth) {
        width = newWidth;
    }
    public double getArea() {
        return height * width;
    }
    public double getPerimeter() {
        return (height*2 + width*2);
    }
    public static int getNumberOfRectangles() {
        return numberOfRectangles;
    }
}

class TestProgram {
    public static void main(String[] args) {
        System.out.println("#Rectangle object created = " + Rectangle.getNumberOfRectangles());
        Rectangle rect1 = new Rectangle();
        System.out.println("rect1: " + " width = " + rect1.getWidth() + " height = " + rect1.getHeight() + " area = " + rect1.getArea() + 
        " perimeter " + rect1.getPerimeter());
        rect1.setWidth(4.0);
        rect1.setHeight(7.0);
        System.out.println("rect1: " + " width = " + rect1.getWidth() + " height = " + rect1.getHeight() + " area = " + rect1.getArea() + 
        " perimeter " + rect1.getPerimeter());
        Rectangle[] array = new Rectangle[5];
        array[0] = new Rectangle(0.0, 0.0);
        array[1] = new Rectangle(1.0, 10.0);
        array[2] = new Rectangle(2.0, 20.0);
        array[3] = new Rectangle(3.0, 30.0);
        array[4] = new Rectangle(4.0, 40.0);
        for (int i=0; i<5; i++) {
            System.out.println("array[" + i + "]:" + " width = " + array[i].getWidth() + " height = " + array[i].getHeight() + " area = " + array[i].getArea() + 
            " perimeter " + array[i].getPerimeter());
        }
        System.out.println("#Rectangle object created = " + Rectangle.getNumberOfRectangles());
    }
}

