package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int one, int two, int three) {
        return one > max(two, three) ? one : max(two, three);
    }

    public static int max(int one, int two, int three, int four) {
        return max(max(one, two), max(three, four));
    }
}