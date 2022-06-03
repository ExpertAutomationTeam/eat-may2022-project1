package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UseHashSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("john");
        set.add("jack");
        set.add("max");
        set.add("max");
        set.add("lila");
        set.add("eva");
        set.add("max");

        System.out.println(set);

        for (String name: set) {
                System.out.println(name);
        }

        set.remove("john");

        System.out.println(set);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(4);
        mySet.add(3);
        mySet.add(4);
        mySet.add(1);
        mySet.add(8);

        System.out.println(mySet);
    }
}
