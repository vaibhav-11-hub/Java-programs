package core;

import java.util.Scanner;

public class SquareAreaPerimeter {
    // Method to calculate area and perimeter of a square
    public static void calculateSquare(double sideLength) {
        // Calculate area
        double area = sideLength * sideLength;
        // Calculate perimeter
        double perimeter = 4 * sideLength;
        
        // Display results
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter the side length of the square: ");
        
        // Check if the input is a valid number
        if (scanner.hasNextDouble()) {
            double sideLength = scanner.nextDouble();
            
            if (sideLength < 0) {
                System.out.println("Side length cannot be negative.");
            } else {
                // Call method to calculate area and perimeter
                calculateSquare(sideLength);
            }
        } else {
            System.out.println("Invalid input! Please enter a numeric value.");
        }

        // Close the scanner
        scanner.close();
    }
}


/*
 Output:
 
 Enter the side length of the square: 23
Area of the square: 529.0
Perimeter of the square: 92.0



*/
