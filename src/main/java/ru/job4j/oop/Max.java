package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        return  max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int four) {
        return  max(first, second, max(third, four));
    }
}
