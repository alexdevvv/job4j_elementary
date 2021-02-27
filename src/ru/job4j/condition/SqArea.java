package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1)); // Высота
        int l = h * k;             // Длинна
        return l * h;           // Площадь

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
