package Objects;

// stores data in key:value pairs

import java.util.HashMap;

public class Hashmap {
    Hashmap<String, String> capitalCities = new HashMap<String, String>();

    // add items with put()
    capitalCities.put("Scotland", "Edinburgh");
    capitalCities.put("England", "London");
    capitalCities.put("Finland", "Helsinki");

    //access item with get() and its key
    capitalCities.get("Scotland");

    // remove item with remove() and key
    capitalCities.remove("England");

    // remove all items ithe clear()
    capitalCities.clear();

    // how many items in map use size()
    capitalCities.size();


    // LOOP through Hashmap use keySet()-
    // Prints keys
    for (String i : capitalCities.keySet()) {
        System.out.println(i);
    }
    // Print values
    for (String i : capitalCities.values()) {
        System.out.println(i);
    }
    // Print keys and values
    for (String i : capitalCities.keySet()) {
        System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }


    // Can also create HashMap to store other data types:
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    people.put("Jin", 27);
    people.put("Taka", 22);
    people.put("Yuna", 26);

    for (String i : people.keySet()) {
        System.out.println("key: " + i + " value: " + people.get(i));
    }
}
