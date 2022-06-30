public class Switch {

    public static String printPlanet(int i) {      // int i - Switch expression
        String planet;
        switch(i){
            // Case statements:
            case 1: planet = "Mercury";
                break;
            case 2: planet = "Venus";
                break;
            case 3: planet = "Earth";
                break;
            // Default case statement:
            default: planet = "Wrong number";
        }
        return planet;
    }

    public static void main(String[] args) {
        System.out.println(Switch.printPlanet(1));
        System.out.println(Switch.printPlanet(2));
        System.out.println(Switch.printPlanet(3));
        System.out.println(Switch.printPlanet(0));
    }
}
