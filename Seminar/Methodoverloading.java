import java.io.*;
class Calculator {
    // Method with 2 integer parameters
    public int add(int a, int b) {
        return a + b;
    }
    // Overloaded method with 3 integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Overloaded method with 2 double parameters
    public double add(double a, double b) {
        return a + b;
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));             // Calls add(int, int)
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));     // Calls add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));   // Calls add(double, double)
    }
}
