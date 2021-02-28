package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                return  "Исходное число делится на 6.";
            } else {
                return  "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (number % 2 == 0) {
                return  "Исходное число не делится на 3, но является четным.";
            } else {
                return  "Исходное число не делится на 3 и не является четным.";
            }
        }

    }
}
