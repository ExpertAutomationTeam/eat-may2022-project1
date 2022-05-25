package classmethodobject;

public class Calculator {

    //method or function: is a reusable block of code that is working only when called
    //non-return method
    void addition(){
        int num1 = 100;
        int num2 = 5;
        int total = num1 + num2;
    }

    void subtraction(int num1, int num2){
        int total = num1 - num2;
    }

    //return method
    int multiplication(){
        int num1 = 10;
        int num2 = 5;
        int total = num1 * num2;
        return total;
    }

    int division(int num1, int num2){
        int total = num1 / num2;
        return total;
    }

    //not related to calculator example
    void person(String name, int age, boolean maritalStatus){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("married: "+maritalStatus);
    }

    String person2(String name, int age, boolean maritalStatus){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("married: "+maritalStatus);
        return name;
    }

}