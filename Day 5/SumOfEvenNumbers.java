import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of even numbers from 1 to " + n + " is " + sum + ".");
        scanner.close();
    }
}
