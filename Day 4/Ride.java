import java.util.Scanner;
public class Ride {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print("Enter your height in cm: ");
        int height = scan.nextInt();
        if (age >= 18 && height >= 150) {
            System.out.println("Eligible for all rides.");
        } else if (age >= 12 && age <= 17 && height >= 140) {
            System.out.println("Eligible for moderate rides.");
        } else {
            System.out.println("Eligible for kid-friendly rides only.");
        }
        scan.close();
    }
}
