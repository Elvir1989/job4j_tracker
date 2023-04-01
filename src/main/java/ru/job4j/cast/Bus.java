package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по асфальту.");
    }

    @Override
    public void fuel() {
        System.out.println(getClass().getSimpleName() + " заправляется бензином.");
    }
}
