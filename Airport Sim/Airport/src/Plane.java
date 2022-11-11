public class Plane {
    private String flightNumber;
    private int fuel;

    public Plane(String flightNumber, int fuel){
        this.flightNumber = flightNumber;
        this.fuel = fuel;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public int getFuel(){
        return this.fuel;
    }

    public void useFuel(){
        this.fuel -= 1;
    }
}
