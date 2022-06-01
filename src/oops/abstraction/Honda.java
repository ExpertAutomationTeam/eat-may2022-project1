package oops.abstraction;

public class Honda implements Car, Motor{

    public void start() {
        System.out.println("auto start system");
    }

    public void stop() {
        System.out.println("secured brake");
    }

    public void carShape() {
        System.out.println("spacious car");
    }

    public void engine() {
        System.out.println("double turbo engine");
    }

    public void fuelType() {
        System.out.println("diesel type");
    }
}
