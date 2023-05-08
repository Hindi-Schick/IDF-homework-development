import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select an option:");
            System.out.println("1. Rectangle Tower");
            System.out.println("2. Triangle Tower");
            System.out.println("3. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Please enter the width and height of the rectangle tower:");
                    int rectWidth = scanner.nextInt();
                    int rectHeight = scanner.nextInt();
                    // Perform calculations for the rectangle tower
                    if (rectHeight - rectWidth == 0 || Math.abs(rectHeight - rectWidth) > 5) {
                        System.out.println("Area: " + rectHeight * rectWidth);
                    } else {
                        System.out.println("Perimeter: " + 2 * (rectHeight + rectWidth));
                    }
                }
                case 2 -> {
                    System.out.println("Please enter the base and height of the triangle tower:");
                    int triBase = scanner.nextInt();
                    int triHeight = scanner.nextInt();
                    // Perform calculations for the triangle tower
                    System.out.println("Please select an option:");
                    System.out.println("1. Calculating the perimeter of the triangle");
                    System.out.println("2. Printing the triangle");
                    int triChoice = scanner.nextInt();
                    switch (triChoice) {
                        case 1 -> System.out.println("Perimeter: " + (triBase * triHeight) / 2);
                        case 2 -> {
                            if (triBase % 2 == 0 || triBase > triHeight * 2) {
                                System.out.println("Cannot print triangle");
                            } else {
                                int numOfRows = (triHeight - 2)/(triBase / 2 - 1);
                                printTriangle (triBase, triHeight, 1, 1, numOfRows);
                            }
                        }
                    }
                }
                case 3 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void printTriangle(int triBase, int triHeight, int i, int j, int numOfRows) {
        if (i == 1) {
            printRow(triBase, i, 1);
            printTriangle(triBase, triHeight, i+numOfRows, j+2, numOfRows);
        } else if (i >= triHeight-1) {
            printRow(triBase, triBase, 1);
            return;
        } else {
            if (j == 3){
                int mod = (triHeight - 2)%(triBase / 2 - 1);
                if (mod == 0){
                    printRow(triBase, j, numOfRows);
                }
                else {
                    printRow(triBase, j, numOfRows+mod);
                }
                printTriangle(triBase, triHeight, i+numOfRows, j+2, numOfRows);
            }
            else {
                printRow(triBase, j, numOfRows);
                printTriangle(triBase, triHeight, i+numOfRows, j+2, numOfRows);
            }
        }

    }

    private static void printRow(int width, int row, int numOfRows) {
        int numSpaces = (width - row / 2);
        for ( int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < row ; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println();
        if (numOfRows != 1) {
            printRow(width, row, numOfRows - 1);
        }
    }
}

