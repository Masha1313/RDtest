import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a personalized greeting
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
