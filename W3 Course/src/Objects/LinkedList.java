package Objects;

// use ArrayList for storing and accessing data, use LinkedList to manipulate data
/* Linked List methods
addFirst()	    Adds an item to the beginning of the list.
addLast()	    Add an item to the end of the list
removeFirst()	Remove an item from the beginning of the list.
removeLast()	Remove an item from the end of the list
getFirst()	    Get the item at the beginning of the list
getLast()	    Get the item at the end of the list
 */

import java.util.LinkedList;

public class LinkedList {
     LinkedList<String> cars = new LinkedList<String>();
     cars.add("Mustang");
     cars.add("GT-R");
}
// has all same methods as ArrayList
// ArrayList is more efficient as its common to need access to random items in the list
