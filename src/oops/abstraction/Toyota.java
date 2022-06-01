package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor {

    //car interface methods
    public void start(){
        System.out.println("start and let's drive");
    }

    public void stop(){
        System.out.println("brake and stop");
    }

    public void carShape(){
        System.out.println("6 feet long car");
    }

    //motor interface methods
    public void engine() {
        System.out.println("engine with turbo");
    }

    public void fuelType() {
        System.out.println("gas type");
    }

    //modern car abstract class
    public void hydraulicBrake() {
        System.out.println("hydraulic brake car");
    }

    //toyota class method
    public void carColor(){
        System.out.println("multiple colors available");
    }
}
