package be.intecbrussel.demo;

public class Plane implements Flyable, FuelConsumer{
    private String planeNumber;

    @Override
    public void fly() {
        System.out.println("I'm an air submarine");
    }

    @Override
    public void consumeFuel(int amount) {

    }

    @Override
    public void superMethod() {

    }
}
