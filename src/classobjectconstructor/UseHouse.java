package classobjectconstructor;

public class UseHouse {
    public static void main(String[] args) {

        House myHouse = new House("white house");

        myHouse.room();
        myHouse.kitchen();
        myHouse.livingRoom();
        myHouse.bathRoom();
        System.out.println(myHouse.unit);
        myHouse.address = 7062;
        System.out.println(myHouse.address);

        House yourHouse = new House("the melenium", 7810);

        House hisHouse = new House();

    }
}
