package Optionals;

import java.util.Optional;

public class CreationCheckRetrieval {


    public static void main(String[] args) {

        //////////// Creation ////////////

        Optional<String> opt1 = Optional.empty();       // initializes Optional with an empty Optional
        System.out.println(opt1);

        int i = 1;
        Optional<Integer> optInt = Optional.of(i);   // creating an Optional object with method of(); argument can't be null.
        System.out.println(optInt);

        String s1 = null;
        String s2 = "A";
        Optional<String> optNull = Optional.ofNullable(s1); // creating an Optional object with method of(); argument may be null
        Optional<String> optNonNull = Optional.ofNullable(s2);
        System.out.println(optNull);
        System.out.println(optNonNull);

        ///////////// Check /////////////





        //////////// Retrieval ////////////

        System.out.println(optNonNull.get());     // get() can only return a value if the wrapped object is not null; otherwise, it throws no such element exception
        //System.out.println(optNull.get());

        String nullString = Optional.ofNullable(s1).orElse("Null!");    // returns the wrapped value if it's present, or replaces value wih argument if value is null
        String nonNullString = optNonNull.orElse("Null!");
        System.out.println(nullString);
        System.out.println(nonNullString);

        String nonNullString2 = Optional.ofNullable(s2).orElseThrow(NullPointerException::new);  // similar to orElse(), but returns exception in case of null value
        //String nullString2 = Optional.ofNullable(s1).orElseThrow(NullPointerException::new);
        System.out.println(nonNullString2);

        String nullMessage = "Null!";
        String nullString3 = optNull.orElseGet(() -> nullMessage);  // similar to orElse(), but returns function in case of null value
        System.out.println(nullString3);


    }
}