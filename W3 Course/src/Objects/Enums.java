package Objects;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}



/* represents a group of constants (unchangeable variables).
ENUM = enumerations = specifically listed

 */


// often used in switch statements:
public class Main {
    public static void main(String[] args) {
        //can access with dot syntax:
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
    // LOOP THROUGH an ENUM - enum has a values() method - returns array of all enum constants
    for (Level myVar : Level.values()) {
        System.out.println(myVar);
    }
}

/* ENUMS can have attributes and methods - difference is that enum constants public, static and final -
    - unchangeable and cannot be overridden
    They cannot be used to create objects or extend other classes, but they can implement interfaces

WHY- used when values are not going to change like days, colours etc
 */
