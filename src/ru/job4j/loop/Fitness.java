package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        if(ivan == nik){
            return month + 1;
        } else {
            while (ivan < nik){
                ivan *= 3;
                nik *= 2;
                month += 1;
            }
            return month;
        }

    }
}
