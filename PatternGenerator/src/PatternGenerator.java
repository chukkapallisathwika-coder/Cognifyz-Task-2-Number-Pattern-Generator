import java.util.Scanner;

/**
 * ================================================================
 *  Cognifyz Technologies - Java Programming Internship
 *  Task 2 : Number Pattern Generator
 * ================================================================
 *
 *  Description:
 *  This program displays a menu of number patterns and allows the
 *  user to choose which pattern to generate. The user provides the
 *  number of rows, and the pattern is printed using loops only
 *  (no arrays, recursion, or external libraries are used).
 *
 *  Patterns supported:
 *      1. Half Pyramid
 *      2. Inverted Pyramid
 *      3. Floyd's Triangle
 *      4. Number Square
 *      5. Exit
 *
 * Developed by: Sathwika Chukkapalli
 * ================================================================
 */
public class PatternGenerator {

    // Single Scanner object shared across the program to read user input
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * The main method - entry point of the program.
     * It repeatedly displays the menu until the user chooses to exit.
     */
    public static void main(String[] args) {

        boolean running = true; // Controls the main program loop

        System.out.println("=================================================");
        System.out.println("   WELCOME TO THE NUMBER PATTERN GENERATOR");
        System.out.println("   Cognifyz Technologies - Java Internship Task 2");
        System.out.println("=================================================");

        // Main program loop - keeps showing the menu until user exits
        while (running) {
            displayMenu();
            int choice = readMenuChoice();

            switch (choice) {
                case 1:
                    int rows1 = readRows();
                    System.out.println("\n--- Half Pyramid Pattern ---");
                    printHalfPyramid(rows1);
                    break;

                case 2:
                    int rows2 = readRows();
                    System.out.println("\n--- Inverted Pyramid Pattern ---");
                    printInvertedPyramid(rows2);
                    break;

                case 3:
                    int rows3 = readRows();
                    System.out.println("\n--- Floyd's Triangle Pattern ---");
                    printFloydsTriangle(rows3);
                    break;

                case 4:
                    int rows4 = readRows();
                    System.out.println("\n--- Number Square Pattern ---");
                    printNumberSquare(rows4);
                    break;

                case 5:
                    running = false;
                    System.out.println("\nThank you for using the Number Pattern Generator!");
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    // This should not normally happen because readMenuChoice()
                    // already validates the range, but kept as a safety net.
                    System.out.println("Invalid choice! Please select a valid option.");
            }

            System.out.println(); // blank line for readability between runs
        }

        scanner.close(); // Close the scanner before the program ends
    }

    /**
     * Displays the main menu options to the user.
     */
    private static void displayMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println("Please choose a pattern to generate:");
        System.out.println("1. Half Pyramid");
        System.out.println("2. Inverted Pyramid");
        System.out.println("3. Floyd's Triangle");
        System.out.println("4. Number Square");
        System.out.println("5. Exit");
        System.out.println("-------------------------------------------------");
        System.out.print("Enter your choice (1-5): ");
    }

    /**
     * Reads and validates the user's menu choice.
     * Keeps prompting until a valid integer between 1 and 5 is entered.
     *
     * @return a valid menu choice (1 to 5)
     */
    private static int readMenuChoice() {
        int choice = -1;
        boolean valid = false;

        while (!valid) {
            String input = scanner.nextLine().trim();

            // Validate that the input contains only digits (a positive number)
            if (isPositiveInteger(input)) {
                choice = Integer.parseInt(input);

                if (choice >= 1 && choice <= 5) {
                    valid = true; // Good input, exit validation loop
                } else {
                    System.out.print("Invalid choice! Please enter a number between 1 and 5: ");
                }
            } else {
                System.out.print("Invalid input! Please enter a whole number between 1 and 5: ");
            }
        }

        return choice;
    }

    /**
     * Reads and validates the number of rows for the pattern.
     * Keeps prompting until a valid positive integer is entered.
     * Rows are capped at a reasonable maximum (100) to keep the
     * console output readable.
     *
     * @return a valid number of rows (1 to 100)
     */
    private static int readRows() {
        int rows = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter the number of rows (1-100): ");
            String input = scanner.nextLine().trim();

            if (isPositiveInteger(input)) {
                rows = Integer.parseInt(input);

                if (rows >= 1 && rows <= 100) {
                    valid = true;
                } else {
                    System.out.println("Invalid input! Rows must be between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a positive whole number.");
            }
        }

        return rows;
    }

    /**
     * Utility method to check whether a given string represents a
     * positive integer (no signs, decimals, or letters allowed).
     * Written using a simple loop instead of regex, keeping the
     * program beginner-friendly.
     *
     * @param input the string to check
     * @return true if the string is a positive integer, false otherwise
     */
    private static boolean isPositiveInteger(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') {
                return false; // Found a non-digit character
            }
        }

        return true;
    }

    // ============================================================
    //                     PATTERN METHODS
    // ============================================================

    /**
     * Prints a Half Pyramid pattern of numbers.
     * Example for rows = 5:
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     *
     * @param rows number of rows in the pattern
     */
    public static void printHalfPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {          // outer loop -> controls rows
            for (int j = 1; j <= i; j++) {          // inner loop -> controls columns
                System.out.print(j + " ");
            }
            System.out.println(); // move to the next line after each row
        }
    }

    /**
     * Prints an Inverted Pyramid pattern of numbers.
     * Example for rows = 5:
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     *
     * @param rows number of rows in the pattern
     */
    public static void printInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {           // outer loop -> counts rows down
            for (int j = 1; j <= i; j++) {          // inner loop -> controls columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /**
     * Prints Floyd's Triangle pattern.
     * Example for rows = 5:
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     *
     * @param rows number of rows in the pattern
     */
    public static void printFloydsTriangle(int rows) {
        int number = 1; // keeps track of the next number to print

        for (int i = 1; i <= rows; i++) {           // outer loop -> controls rows
            for (int j = 1; j <= i; j++) {          // inner loop -> controls columns
                System.out.print(number + " ");
                number++; // increment for the next value
            }
            System.out.println();
        }
    }

    /**
     * Prints a Number Square pattern where every row contains the
     * same sequence of numbers from 1 to 'rows'.
     * Example for rows = 5:
     * 1 2 3 4 5
     * 1 2 3 4 5
     * 1 2 3 4 5
     * 1 2 3 4 5
     * 1 2 3 4 5
     *
     * @param rows number of rows (and columns) in the square
     */
    public static void printNumberSquare(int rows) {
        for (int i = 1; i <= rows; i++) {           // outer loop -> controls rows
            for (int j = 1; j <= rows; j++) {       // inner loop -> controls columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
