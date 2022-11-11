package Objects;
// nesting classes

public class Nesting {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Nesting myOuter = new Nesting();
        Nesting.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

// can mark inner class as private so it cannot be accessed outside outer class
// or static which means it can be accessed without creating the outer class object first
// static inner classes do NOT have access to members of the outer class