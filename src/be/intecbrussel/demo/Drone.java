package be.intecbrussel.demo;

public class Drone implements Flyable, FuelConsumer{
    private int propellerCount;

    @Override
    public void fly() {
        System.out.println("Woosh woosh propellers on");
    }

    @Override
    public void consumeFuel(int amount) {

    }

    @Override
    public void superMethod() {

    }
}
