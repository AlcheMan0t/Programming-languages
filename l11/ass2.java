package asdasdasd;

import java.io.*;

public class asdasd {
    public static void main(String[] args) throws NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int rows, cols;
        try {
            System.out.print("Enter the number of rows: ");
            rows = Integer.parseInt(reader.readLine());

            System.out.print("Enter the number of columns: ");
            cols = Integer.parseInt(reader.readLine());

            if (rows <= 0 || cols <= 0) {
                throw new IllegalArgumentException("Dimensions must be positive integers.");
            }

        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Invalid input. " + e.getMessage());
            return;
        }
        int[][] array = new int[rows][cols];

        try {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    array[i][j] = Integer.parseInt(reader.readLine());
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only.");
            return;
        }

        int sum = 0;
        for (int[] row : array) {
            for (int value : row) {
                sum += value;
            }
        }
        double average = (double) sum / (rows * cols);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
