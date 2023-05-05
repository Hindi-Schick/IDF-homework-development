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
                                if (triBase % 2 == 1 && triBase < triHeight * 2) {
                                    int numSpaces = triHeight - 1;
                                    int numStars = 1;
                                    int numMiddleRows = (triBase - 1) / 2;
                                    int numTopRows = (triHeight - numMiddleRows) / 2;
                                    int numBottomRows = triHeight - numTopRows - numMiddleRows;

                                    // Print top rows
                                    for (int i = 0; i < numTopRows; i++) {
                                        printRow(numSpaces, numStars);
                                        numSpaces--;
                                        numStars += 2;
                                    }

                                    // Print middle rows
                                    for (int i = 0; i < numMiddleRows; i++) {
                                        printRow(numSpaces, numStars);
                                        numSpaces--;
                                        numStars += 2;
                                    }

                                    // Print bottom rows
                                    for (int i = 0; i < numBottomRows; i++) {
                                        printRow(numSpaces, numStars);
                                        numSpaces--;
                                        numStars += 2;
                                    }
                                } else {
                                    System.out.println("Triangle not prin table.");
                                }



                                /*int rows = triHeight;
                                int firstGroup = 3;
                                int mod = (rows - 2) % (triBase - 2);
                                int mod2 = mod;
                                int doubleRow = (rows - 2) / (triBase - 2);
                                int asterisks = 1;

                                for (int i = 1; i <= rows; i++) {
                                    for (int j = 1; j <= (rows - asterisks) / 2; j++) {
                                        System.out.print(" ");
                                    }
                                    for (int j = 1; j <= asterisks; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();

                                    if ((i - mod2 - 1) % doubleRow == 0) {
                                        if (mod != 0 && asterisks == firstGroup){
                                            mod -= 1;
                                        }
                                        else {
                                            asterisks += 2;
                                        }
                                    }
                                }
                                int middle = triBase / 2 + 1;
                                for (int i = 1; i <= triHeight; i++) {
                                    int stars = i * 2 - 1;
                                    int dots = middle - i;
                                    for (int j = 1; j <= dots; j++) {
                                        System.out.print(".");
                                    }
                                    for (int j = 1; j <= stars; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }*/
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

    private static void printRow(int numSpaces, int numStars) {
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

