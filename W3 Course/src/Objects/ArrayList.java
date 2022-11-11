package Objects;
// ArrayList is a resizable array
import java.util.ArrayList;

public class ArrayList {
    ArrayList<String> cars = new ArrayList<String>();     // creates a new array list
    // add method to add items:
    cars.add("Mustang");
    cars.add("GT-R");

    // access with get() method and give index
    cars.get(0);

    // change an element with set() method - takes index and new element:
    cars.set(1, "DB-7");

    // remove element with index number
    cars.remove(1);

    // remove all elements with clear()
    cars.clear();

    // how many elements in it, use size()
    cars.size();

    // Loop through - use size() for endpoint
    for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
    }

    // can also use FOR EACH
    for (String i : cars) {
        System.out.println(i);
    }
}

import java.util.Collections;
// To use other type (not an object) - just use different wrapper when declaring:
public class IntArrayList {
    ArrayList<Integer> someNums = new ArrayList<Integer>();
    someNums.add(4);
    someNums.add(11);
    someNums.add(17);

    // SORTING - import collections class from util package
    Collections.sort(someNums);
}