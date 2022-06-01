package oops.inheritance;

public class UseInheritance {

    public static void main(String[] args) {

        Bird sparrow = new Bird();
        sparrow.communicate();

        GrandFather david = new GrandFather();
        david.height();
        david.communicate();

        Father john = new Father();
        john.education();
        john.height();

        Son brad = new Son();
        brad.education();
        brad.height();

    }

}
