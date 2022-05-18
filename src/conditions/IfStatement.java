package conditions;

public class IfStatement {
    public static void main(String[] args) {

        //if(condition){ work }
        //if(condition){ work } else { remaining option }
        //if(condition){ work } else if(condition){ work }...
        //if(condition){ work } else if(condition){ work }... else { remaining option }
        int number = -1;

        if (number > 0){
            System.out.println("this number is positive");
        }else if (number < 0){
            System.out.println("this number is negative");
        } else {
            System.out.println("this number equals to 0");
        }

        int age = 15;
        String gender = "F";

        //nested condition: is a condition inside a condition
        if (age > 18){
            if(gender == "F"){
                System.out.println("this lady is an adult");
            }else if (gender == "M"){
                System.out.println("this guy is an adult");
            }
        }else {
            if(gender == "F"){
                System.out.println("this lady is an minor");
            }else if (gender == "M"){
                System.out.println("this guy is an minor");
            }
        }

    }
}
