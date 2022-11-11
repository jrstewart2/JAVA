package Objects;

public class Car {
    // CLASS ATTRIBUTES
    protected String make;
    protected String model;
    protected int price;
    protected int topSpeed;

    // CLASS CONSTRUCTORS
    public Car() {
        this.make = "unspecified";
        this.model = "unspecified";
        this.price = 0;
        this.topSpeed = 120;
    }

    public Car(String make, String model, int price){
        this.make = make;
        this.model = model;
        this.price = price;
    }


    // CLASS METHODS
    public void fullThrottle(){
        System.out.println("Speeding up!");
    }

    public void speed(int speed){
        System.out.println("Going " + speed + "mph");
    }


    // GETTERS
    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return this.price;
    }

}


public class Supercar extends Car{

}


// if attribute is not set to private, it can be changed via car.make = "blah"#
// private means you need getters and setters to access
// final means it is immutable

// STATIC method -> can be accessed without creating an object of the class
// PUBLIC method -> can only be accessed by objects

/*
        ACCESS MODIFIERS
   For Classes:
        - public: class is accessible by other classes
        - default: class is only accessible by other classes in same package

   For attributes, methods, constructors:
        - public: accessible for all classes
        - private: accessible only within declared class
        - default: only accessible within same package
        - protected: code is accessible in same package and subclasses

        NON-ACCESS MODIFIERS
   For Classes:
        final:  class cannot be inherited by another class
        abstract: class cannot be used to create objects - to access, must be inherited by another class

   For attributes / methods:
        final: cannot be overridden or modified
        static: attributes and methods belong to the class rather than an object
        abstract:  only used on methods of abstract classes: does not have a body, body is provided in subclass
        transient: attributes & methods are skipped when serializing the object containing them
        synchronized: methods only accessed by one thread at a time
        volatile: value of attribute is not cached thread-locally, is always read from main memory
         */

/*
ENCAPSULATION - to make sensitive data hidden from users
    declare variables/attributes as private
    provide GET and SET methods

POLYMORPHISM - use methods from superclass to perform a different task
aka create method of same name as in parent class and make it do something else
 */