package statickeyword;

public class Human {

    int height;
    static int weight;

    //non-static method can use both static and non-static variables
    public void smile(){
        height = 8;
        weight = 170;
        System.out.println("people smile for no reason");
    }

    //static method can use static variables only
    public static void talk(){
        //height = 9;//this is not possible to do
        weight = 190;
        System.out.println("people talk to say say nothing");
    }

}
