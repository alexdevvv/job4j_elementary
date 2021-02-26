package ru.job4j.calculator;

public class Fit {
    // Метод определяющий идеальный вес для мужчины
    public static double manWeight(short height) {
        return  (height - 100) * 1.15;
    }

    // Метод определяющий идеальный вес для женщины
    public static double womanWeight(short height) {
        return  (height - 110) * 1.15;

    }

    public static void main(String[] args){
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
