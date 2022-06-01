package oops.polymorphism;

public class ModernCalculator extends Calculator{

    //method overriding: methods using same name, same parameters but different body
    //run time polymorphism
    @Override
    public void sub(int num1, int num2){
        int total = num1 - num2 + 20;
    }

}
