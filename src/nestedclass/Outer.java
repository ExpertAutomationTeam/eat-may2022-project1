package nestedclass;

public class Outer {

    int outerNum = 6;

    Outer(){

    }

    public void outerMethod(){
        System.out.println("this is outer class method");
    }

    Inner inner = new Inner();

    class Inner{

        int innerNum = 0;

        Inner(){

        }

        public void innerMethod(){
            System.out.println("this is inner class method");
        }
    }
}
