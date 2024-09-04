public class FactorialCalculator {
    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
    public static void main(String[] args) {
        int number = 5; 
        int factorial = calculateFactorial(number); 
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

