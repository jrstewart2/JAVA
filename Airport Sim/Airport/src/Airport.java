public class Airport {
    private static Plane[] landingQueue = new Plane[10];
    private static Plane[] runway = new Plane[1];
    private int landingTime = 2;

    public Airport(){}

//    public void addPlaneToLandingQueue(Plane){
//        landingQueue
//    }
    public Plane getLandingQueue(){
        return this.landingQueue[0];
    }

    public void searchForPlane(){
        double x = Math.random()*100;
        System.out.println(x);
        if(x > 50) {
            generatePlane();
        }
    }

    private String generateFlightNumber(){
        int firstDigit = (int) (Math.random() * 10);
        int secondDigit = (int) (Math.random() * 10);
        int thirdDigit = (int) (Math.random() * 10);
        int fourthDigit = (int) (Math.random() * 10);
        String flightNumber = "F" + firstDigit + secondDigit + thirdDigit + fourthDigit;
        return flightNumber;
    }

    private void generatePlane(){
        String flightNumber = generateFlightNumber();
        int fuel = (int) (Math.random() * 10);
        Plane plane = new Plane(flightNumber, fuel);
        System.out.println("Plane with flight number " + plane.getFlightNumber() + " and " + plane.getFuel() + " minutes of fuel");
        addToLandingQueue(plane);
    }

    private void addToLandingQueue(Plane plane){
        for(int i = 0; i < landingQueue.length; i++){
            if(landingQueue[i] == null){
                landingQueue[i] = plane;
                System.out.println("Plane added to landing queue at postiion " + i);
                break;
            } else if ( (i + 1) == landingQueue.length){
                System.out.println("Landing queue full - re-routing plane to another airport");
            }
        }
    }
}
