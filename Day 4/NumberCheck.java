import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);
        scanner.close();
    }
}
