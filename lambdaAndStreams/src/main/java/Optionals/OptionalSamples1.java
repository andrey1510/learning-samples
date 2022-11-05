package Optionals;

import java.util.Optional;

public class OptionalSamples1 {
    static String defaultValue = "Null!";

    static String n = null;
    static Optional<String> opt3 = Optional.ofNullable(n);

    public static String getData() {
        return opt3.orElse("Null!");
    }

    public static Optional<String> getData2() {
        return opt3.or(() -> Optional.ofNullable(defaultValue));
    }

    public static void main(String[] args) {

        if (opt3.isPresent()) {                     // лучше использовать orElse
            System.out.println(opt3.get());         // распаковка с помощью get() с проверкой наличия нуля через isPresent()
        } else {
            System.out.println("Null value");
        }

        System.out.println(OptionalSamples1.getData2());

    }
}
