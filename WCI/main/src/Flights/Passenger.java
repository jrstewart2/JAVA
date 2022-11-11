class Passenger implements Comparable<Passenger> {
    private String name;
    private int memberLevel;
    private int memberDays;

    public Passenger(String name, int memberLevel, int memberDays){
        this.name = name;
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
    }

    public int compareTo(Passenger p) {

        int returnValue = p.memberLevel - memberLevel;
        if (returnValue == 0)
            returnValue = p.memberDays-memberDays;
        return returnValue;
    }

//    public Passenger(int freeBags){
//        this(freeBags > 1 ? 25.0d : 50.0d);
//        this.freeBags = freeBags;
//    };
//    public Passenger (int freeBags, int checkedBags) {
//        this(freeBags);
//        this.checkedBags = checkedBags;
//    };
//    private Passenger (double perBagFee) {
//        this.perBagFee = perBagFee;
//    };
}

// can be public final or final public