package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {

        return x + y;
    }

    public static int minus(int c) {

        return c - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {

        return b / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);

        int rsl1 = minus(5);
        System.out.println(rsl1);

        int rsl = calculator.multiply(5);
        System.out.println(rsl);

        int rsl2 = calculator.divide(5);
        System.out.println(rsl2);

        int result1 = calculator.sumAllOperation(5);
        System.out.println(result1);
    }
}
