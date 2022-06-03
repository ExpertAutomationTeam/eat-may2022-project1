package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(9);

        //System.out.println(list.get(0));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(5);

        System.out.println(list);

        list.add(3, 20);

        System.out.println(list);

        list.set(1, 50);

        System.out.println(list);

        ArrayList<Object> myList = new ArrayList<>();
        myList.add(4);
        myList.add("john");
        myList.add(true);
        myList.add('&');
        myList.add(1.5);

        System.out.println(myList);
    }
}
