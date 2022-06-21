import java.util.Optional;

public class OptionalSamples {

    ////////////////////// Creation of Optional /////////////////////////

    Optional<String> opt1 = Optional.empty();       // initializes Optional with an empty Optional

    int i = 1;
    Optional<Integer> opt2 = Optional.of(i);

    String n = null;
    Optional<String> opt3 = Optional.ofNullable(n);

}
/////////////////////////////

//class OptionalSamples2 {
//    Data1 s = new Data1(1,null,1);
//
//    public int getIDOptional(Optional<Data1> s) {
//        return s.stream()
//                .flatMap(Data1::getTitle)
//                .map(Data1::getID)
//                .orElse("NullTitle");
//    }
//}

    //////////////////////////// распаковка опционалов  ///////////////////////////

class OptionalSamples2 {
    static String defaultValue = "No value";

    static String n = null;
    static Optional<String> opt3 = Optional.ofNullable(n);
    static String s1 = opt3.orElse("Null value 1");   // распаковка с помощью orElse

    static String supplier = "Null value 2";
    static String s2 = opt3.orElseGet(() -> supplier);   // распаковка с помощью orElseGet


    public static Optional<String> getOpt3() {
        return opt3;
    }
    public static String getData() {
        return getOpt3().orElseThrow();             // распаковка с помощью get с orElseThrow
    }

    public static Optional<String> getData2(int i) {
        return getOpt3().or(() -> Optional.ofNullable(defaultValue));
    }

    public static void main(String[] args) {

        if (opt3.isPresent()) {                     // лучше использовать orElse
            System.out.println(opt3.get());         // распаковка с помощью get() с проверкой наличия нуля через isPresent()

        } else {
            System.out.println("Null value 3");
        }

        System.out.println(OptionalSamples2.getData2(1));
        System.out.println(s1);
        System.out.println(s2);

    }
}

//////////////////////////// filter  ///////////////////////////

//class OptionalSamples3 {
//
//    public static void main(String[] args) {
//        List<String> colors1 = new ArrayList<>(Arrays.asList(null, "Blue", "Green", "Yellow"));
//        Optional<Object> optColors1 = colors1.ifPresent(x -> System.out.println("ok"));
//    }
//}


class OptionalSamples4 {
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

