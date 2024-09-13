public class DivideByZeroExample {
    public static void main(String[] args) {
        try {
            // Attempt to divide 10 by 0
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException and print a message
            System.out.println("Cannot divide by zero");
        }
    }
}

