public class Recussion {
  public static int calculateFactorial(int n) {
      if (n == 0 || n == 1) {
          return 1;
      }
      return n * calculateFactorial(n - 1);
  }
  public static void main(String[] args) {
      int number = 5; 
      int factorial = calculateFactorial(number); 
      System.out.println("The factorial of " + number + " is: " + factorial);
  }
}
