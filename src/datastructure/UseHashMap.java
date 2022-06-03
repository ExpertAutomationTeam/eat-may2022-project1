package datastructure;

import java.util.*;

public class UseHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first name", "john");
        map.put("last name", "snow");
        map.put("phone number", "9176785374");
        map.put("address", "Beverley Hills");
        map.put("state", "california");

        System.out.println(map.get("last name"));
        System.out.println(map);

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }

        List<String> citiesOfUsa = new ArrayList<>();
        citiesOfUsa.add("NYC");
        citiesOfUsa.add("LA");
        citiesOfUsa.add("CALI");

        List<String> citiesOfCanada = new ArrayList<>();
        citiesOfCanada.add("TO");
        citiesOfCanada.add("MO");
        citiesOfCanada.add("OT");

        List<String> citiesOfAustralia = new ArrayList<>();
        citiesOfAustralia.add("SY");
        citiesOfAustralia.add("ME");
        citiesOfAustralia.add("PE");

        Map<String, List<String>> myMap = new HashMap<>();
        myMap.put("USA", citiesOfUsa);
        myMap.put("canada", citiesOfCanada);
        myMap.put("australia", citiesOfAustralia);

        System.out.println(myMap.get("USA"));

        for (Map.Entry<String, List<String>> entry: myMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
