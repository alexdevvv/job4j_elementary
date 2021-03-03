package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-1);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        } else if (number == 0) {
            System.out.println("This number is 0");
        } else {
            System.out.println("This is positive numbers");
        }
    }
}
