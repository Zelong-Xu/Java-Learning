import java.util.Scanner;

public class UserInfo {
    public static void UserInfo (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your gender (M/F): ");
        String gender = scanner.nextLine();

        System.out.print("Enter your favorite pet: ");
        String favoritePet = scanner.nextLine();

        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Favorite Pet: " + favoritePet);

        scanner.close();
    }

    public static void main(String[] args) {
        UserInfo(args);
    }
}

