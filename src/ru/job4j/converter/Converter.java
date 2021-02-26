package ru.job4j.converter;

public class Converter {

    // Метод переводящий рубли в евро
    public static int rubleToEuro(int value) {
        return  value / 70;

    }

    // Метод переводящий рубли в доллары
    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }


    public static void main(String[] args) {
//        int euro = Converter.rubleToEuro(140);
//        int dollar = Converter.rubleToDollar(180);
//        System.out.println("140 rubles are " + euro + " euro.");
//        System.out.println("180 rubles are " + dollar + " dollars.");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        // Тестирование метода rubleToDollar
        int in2 = 180;
        int expected2 = 3;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed2);

    }
}
