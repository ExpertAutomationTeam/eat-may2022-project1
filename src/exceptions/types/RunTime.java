package exceptions.types;

public class RunTime {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        try {
            System.out.println("line 7 "+(num1 / num2));
        }catch (Exception e){
            System.out.println("line 7 error occurred");
        }
        System.out.println("line 8");
        System.out.println("line 9");
        System.out.println("line 10");
        System.out.println("line 11");



    }
}
