//
//public class Flight implements Comparable<Flight>, Iterable<Passenger> {
//    private int passengers, totalCheckedBags, seats;
//    private static int allPassengers, maxPassengersPerFlight;
//    private int flightNumber;
//    private char flightClass;
//    private boolean[] isSeatAvailable = new boolean[seats];
//    private int getSeats() { return 150; };
//    private ArrayList<Passenger> passengerList = new ArrayList<>();

//    public Iterator<Passenger> iterator() {
//    return passengerList.iterator();
//        }
//    @Override
//    public boolean equals(Object o) {
//        if(super.equals(o))
//            return true;
//        if (!(o instanceof Flight ))
//            return false;
//
//        Flight flight = (Flight) o;
//        return flightNumber == flightNumber &&
//                flightClass == flight.flightClass;
//        }
//
//    static {
//        AdminService admin = new AdminService();
//        admin.connect();
//        maxPassengersPerFlight = admin.isRestricted() ?
//                admin.getMaxFlightPassengers() : Integer.MAX_VALUE;
//        admin.close();
//    }
//
//    {
//       for(int i = 0; i < seats; i++)
//           isSeatAvailable[i] = true;
//    }
//
//    public Flight() {}
//
//    public Flight(int flightNumber) {
//        this.flightNumber = flightNumber;
//    }
//
//    public Flight(char flightClass) {
//        this.flightClass = flightClass;
//    }
//
//    public int getSeats(){
//        return seats;
//    }
//
//    public void setSeats(int seats){
//        this.seats = seats;
//    }
//
//    public static int getAllPassengers() {
//        return allPassengers;
//    }
//
//    public static void resetAllPassengers() {
//        allPassengers = 0;
//    }
//
//    public boolean hasRoom(Flight f2) {
//        int total = this.passengers + f2.passengers;
//        return total <= seats;
//    }
//
//    public void add1Passenger() {
//        if(hasSeating()) {
//            passengers += 1;
//            allPassengers += 1;
//        } else
//            handleTooMany();
//    }
//
//    public void add1Passenger(int bags) {
//        if(hasSeating()) {
//            add1Passenger();
//            totalCheckedBags += bags;
//        }
//    }
//
//    public void addPassengers(Passenger... list){   //variable length Passenger list
//        if (hasSeating(list.length)) {
//            passengers += list.length;
//            for (Passenger passenger : list){
//                totalCheckedBags += passenger.getCheckedBags();
//            }
//        }
//    }
//
//    private boolean hasSeating() {
//        return passengers < getSeats();
//    }
//
//    private boolean hasSeating(int count){
//        return passengers + count <= seats;
//    }
//
//    private void handleTooMany() {
//        System.out.println("Too many");
//    }
//}

/*
Flight flight1 = new Flight();
Flight flight2 = new Flight();
flight2.add1Passenger();


Passenger luisa = new Passenger(0,1);
Passenger john = new Passenger(0,2);
f.addPassengers(luisa, john);

*/







//CargoFlight cf = new CargoFlight();
//cf.add1Package(1.0f, 2.5f, 3.0f);
//Passenger jack = new Passenger(0, 2);
//cf.add1Passenger(jack);
