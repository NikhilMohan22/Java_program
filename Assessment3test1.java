package Test1;

import java.util.Arrays;

public class Assessment3test1 {



    // Method to sort the array
    public static void sort(int[] array, boolean ascending) {
        if (ascending) {
            Arrays.sort(array); // Sort in ascending order
        } else {
            Arrays.sort(array); // First sort in ascending order
            reverse(array);     // Then reverse for descending order
        }
    }

    // Method to reverse the array
    private static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Original array:");
        printArray(array);

        // Sort in ascending order
        sort(array, true);
        System.out.println("Sorted in ascending order:");
        printArray(array);

        // Sort in descending order
        sort(array, false);
        System.out.println("Sorted in descending order:");
        printArray(array);
    }
}

