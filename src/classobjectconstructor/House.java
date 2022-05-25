package classobjectconstructor;

public class House {

    //variables
    public int address;
    String name;
    char unit = 'A';

    //constructor: is a block of code similar to method, implicitly called when the object is created

    //built constructors
    House(String name){
        this.name = name;
    }
    House(String name, int address){
        this.name = name;
        this.address = address;
    }

    //default constructor
    public House(){

    }

    //methods
    public void room(){
        System.out.println("sleep hard zzzzzzzzzzzzz");
    }

    void kitchen(){
        System.out.println("cook yummy yummy");
    }

    void bathRoom(){
        System.out.println("shower shower lalalalalala");
    }

    void livingRoom(){
        System.out.println("watch tv");
    }

}
