package Optionals;

import java.util.Optional;

public class OptionalSamples4 {
    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(OptionalSamples4.stringToInt(null));
        System.out.println(OptionalSamples4.stringToInt("a"));
    }

}
