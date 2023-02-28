package com.vibfft;

public abstract class ToStringExercise extends Exercise {

    ExType type;
    ExLevel level;

    ToStringExercise() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }
}

class Vehicle extends ToStringExercise {
    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{licensePlate=" + this.licensePlate + "}";
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{licensePlate=" + licensePlate + ",numberOfSeats=" + numberOfSeats + "}";
    }

    public static void main(String[] args) {
        Car c = new Car("ABC", 4);
        System.out.println(c);

        Vehicle v = new Vehicle("ABC");
        System.out.println(v);
    }


}
