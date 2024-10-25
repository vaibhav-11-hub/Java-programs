package core;

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        // Initialize a larger data type
        double doubleValue = 9.78;

        // Perform narrowing type casting
        int intValue = (int) doubleValue; // Converting double to int
        float floatValue = (float) doubleValue; // Converting double to float
        byte byteValue = (byte) doubleValue; // Converting double to byte

        // Displaying the original and casted values
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Narrowed int value: " + intValue);
        System.out.println("Narrowed float value: " + floatValue);
        System.out.println("Narrowed byte value: " + byteValue);
    }
}


/*
  Output:
  
  Original double value: 9.78
  Narrowed int value: 9
  Narrowed float value: 9.78
  Narrowed byte value: 9
*/