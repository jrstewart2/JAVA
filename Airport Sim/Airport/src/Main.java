
public class Main {
    public static void main(String[] args) {

        // airport generated - WORKS
        Airport airport = new Airport();
        System.out.println(airport.getLandingQueue()); // returns Null

        // generate initial Planes
        for(int i = 0; i < 10; i++) {
            System.out.println("Searching for a new plane");
            airport.searchForPlane();
        }

    }
}