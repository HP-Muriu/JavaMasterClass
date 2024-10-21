package dev.lpa;

import java.util.Scanner;

public class Main {

    // Method to read an integer from the user
    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        return scanner.nextInt();
    }

    // Method to read 'count' number of elements from the user and return them as an array
    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[count];
        System.out.println("Enter " + count + " integers:");

        for (int i = 0; i < count; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    // Method to find the minimum value in the array
    public static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Step 1: Read the number of elements
        int count = readInteger();

        // Step 2: Read the elements
        int[] elements = readElements(count);

        // Step 3: Find the minimum value
        int minValue = findMin(elements);

        // Step 4: Print the minimum value
        System.out.println("The minimum value is: " + minValue);
    }
}

