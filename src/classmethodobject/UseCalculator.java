package classmethodobject;

public class UseCalculator {
    public static void main(String [] args){

        //object: instance of a class
        Calculator cal = new Calculator();

        //call the addition method
        cal.addition();
        cal.subtraction(50, 25);
        System.out.println(cal.multiplication());
        System.out.println(cal.division(100, 50));

        Calculator calculator2 = new Calculator();
        calculator2.subtraction(100, 5);
        int myTotal = calculator2.division(20, 5);

        //a return method can be printed and assigned as a value

        Calculator calculator3 = new Calculator();
        calculator3.person("Jack", 30, true);

    }
}
