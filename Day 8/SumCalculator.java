public class SumCalculator {
    public static int calculateSum(int num1, int num2) {
        int result = num1 + num2; 
        return result; 
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = calculateSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
