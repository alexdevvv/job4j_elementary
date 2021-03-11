package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        int[][] array = multiple(9);
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);

            }
        }
    }
}
