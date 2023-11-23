package hashcodeAndEquals.notOverrideInSet;

import java.util.HashSet;
import java.util.Set;

public class Launcher {

    public static void main(String[] args) {

        testElementAllOverriden();
        testElementNoOverride();
        testElementHashOverridenForNumber();
        testElementEqualsOverridenForNumber();
    }

    private static void testElementAllOverriden(){
        Set<ElementAllOverriden> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(new ElementAllOverriden(i+1, (char) (97+i)));
            set.add(new ElementAllOverriden(i+1, (char) (110+i)));
        }
        System.out.println("    number, letter - hash, equals overriden:");
        System.out.println(set);
    }

    private static void testElementNoOverride(){
        Set<ElementNoOverride> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(new ElementNoOverride(i+1, (char) (97+i)));
            set.add(new ElementNoOverride(i+1, (char) (110+i)));
        }
        System.out.println("    no override:");
        System.out.println(set);
    }

    private static void testElementHashOverridenForNumber(){
        Set<ElementHashOverridenForNumber> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(new ElementHashOverridenForNumber(i+1, (char) (97+i)));
            set.add(new ElementHashOverridenForNumber(i+1, (char) (110+i)));
        }
        System.out.println("    number hash overriden:");
        System.out.println(set);
    }

    private static void testElementEqualsOverridenForNumber(){
        Set<ElementEqualsOverridenForNumber> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(new ElementEqualsOverridenForNumber(i+1, (char) (97+i)));
            set.add(new ElementEqualsOverridenForNumber(i+1, (char) (110+i)));
        }
        System.out.println("    number equals overriden:");
        System.out.println(set);
    }

}
