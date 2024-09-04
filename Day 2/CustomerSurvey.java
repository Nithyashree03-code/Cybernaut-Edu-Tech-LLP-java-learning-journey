import java.util.Scanner;
public class CustomerSurvey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isShoppingFun;
        int age;
        char gender;
        String favoriteCategory;
        System.out.print("Do you find shopping fun? (true/false): ");
        isShoppingFun = scan.nextBoolean();
        System.out.print("Please enter your age: ");
        age = scan.nextInt();
        System.out.print("Please enter your gender (M/F): ");
        gender = scan.next().charAt(0);
        scan.nextLine();
        System.out.print("What is your favorite shopping category? ");
        favoriteCategory = scan.nextLine();
        System.out.println("\nSurvey Results:");
        System.out.println("Finds shopping fun: " + isShoppingFun);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Favorite shopping category: " + favoriteCategory);
        scan.close();
    }
}
