package datatype.primitive;

public class Casting {
    public static void main(String[] args) {

        //type casting

        //down casting: double > float > long > int > char > short > byte
        double number = 1.5;

        int number2 = (int)number;

        //up casting: byte > short > char > int > long > float > double
        int number3 = 30;

        double number4 = number3;

    }
}
