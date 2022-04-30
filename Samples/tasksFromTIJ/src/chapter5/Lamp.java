package chapter5;

class Light {
    // Fields:
    private int noOfWatts; // wattage
    private long noOfWattsLong;
    private boolean indicator; // on or off
    private String location; // placement
    // Constructors:
    Light() { // (1) No-argument constructor
        noOfWatts = 0;
        indicator = false;
        location = "X";
        System.out.println("Returning from no-argument constructor no. 1.");
    }
    Light(long watts, boolean onOffState) { // (2)
        noOfWattsLong = watts;
        indicator = onOffState;
        location = "X";
        System.out.println("Returning from constructor no. 2 - Long ");
    }
    Light(int watts, boolean onOffState) { // (2)
        noOfWatts = watts;
        indicator = onOffState;
        location = "X";
        System.out.println("Returning from constructor no. 2.");
    }

    Light(int noOfWatts, boolean indicator, String location) { // (3)
        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        this.location = location;
        System.out.println("Returning from constructor no. 3.");
    }

    public static void main(String[] args) {

        new Light(1,true);
    }
}