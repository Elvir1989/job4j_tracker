package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Ехать!");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Количество пассажиров " + numberOfPassengers);
    }

    @Override
    public double refuel(double fuel) {
        double priceOfFuel = 3.05;
        return fuel * priceOfFuel;
    }
}
