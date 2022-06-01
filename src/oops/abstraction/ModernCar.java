package oops.abstraction;

public abstract class ModernCar {

    int age;

    //abstract methods
    public abstract void hydraulicBrake();

    //non-abstract methods
    public void navigationSystem(){
        System.out.println("powered by garmin navigation");
    }
}
