import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the input values
        System.out.println("Hello " + name + ", you are " + age + " years old.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
