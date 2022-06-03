package singleton;

public class Singleton {

    //singleton: object hiding

    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }

    public void doWork(){
        System.out.println("do task that you need");
    }
}
