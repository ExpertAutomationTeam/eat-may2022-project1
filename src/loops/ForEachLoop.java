package loops;

public class ForEachLoop {
    public static void main(String[] args) {

        //for each loop
        String[] array = {"jack", "dave", "brad", "moe", "lesley"};

        //uses the concept of reassignment in each iteration
        for(String name: array){
            System.out.println(name);
        }

    }
}
