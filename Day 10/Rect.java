// Define the Rectangle class
class Rectangle {
    // Instance variables
    private int length;
    private int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return length * width;
    }
}

// Main class to run the program
public class Rect {
    public static void main(String[] args) {
        // Create an instance of Rectangle with length 10 and width 5
        Rectangle rectangle = new Rectangle(10, 5);

        // Calculate and print the area of the rectangle
        int area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
