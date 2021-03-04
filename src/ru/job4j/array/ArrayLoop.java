package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = new int[5];

        // Инициализируем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 3;
        }

        // Выводим массив на консоль
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
