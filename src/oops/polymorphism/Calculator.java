package oops.polymorphism;

public class Calculator {

    //method overloading: methods using same name with different parameters
    //compile time polymorphism
    public void add(int num1, int num2){
        int total = num1 + num2;
    }

    public void add(int num1, int num2, int num3){
        int total = num1 + num2 + num3;
    }

    public void sub(int num1, int num2){
        int total = num1 - num2;
    }
}
