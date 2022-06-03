package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(9);

        Iterator it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

//        System.out.println(it.next());
//        System.out.println(it.next());

    }
}
