package Test1;

public class assessment3test2 {



    public static void main(String[] args) {
        // Define a 4x4 2D array
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 31, 12},
            {13, 14, 15, 16}
        };

        // Variables to store sums of diagonals
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Calculate sums of both diagonals
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    primaryDiagonalSum += matrix[i][j]; // Sum for primary diagonal
                }
                if (i + j == 3) {
                    secondaryDiagonalSum += matrix[i][j]; // Sum for secondary diagonal
                }
            }
        }

        // Print the results
        System.out.println("Sum of primary diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
    }
}

