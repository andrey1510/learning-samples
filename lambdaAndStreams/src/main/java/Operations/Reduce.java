package Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

    List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 2, 3));
    List<String> colors1 = new ArrayList<> (Arrays.asList("Orange", "Blue", "Green", "Yellow"));

    public void summarize() {
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);   //    (0, (e1, e2) -> e1 + e2);
        System.out.println("Sum:" + sum);
    }

    public void summarize2() {
        int r = numbers.stream()
                .reduce(3, Integer::sum);   //    (0, (e1, e2) -> e1 + e2);
        System.out.println("Sum + 3:" + r);
    }

    public void summarize3() {
        String r = colors1.stream()
                            .reduce("colors - ", (e1, e2) -> e1 + e2); //  identity - stores the initial value of the reduction operation and also the default result when the stream of Integer values is empty
        System.out.println(r);
    }

    public void concatenate1() {
        String r = colors1.stream()
                .reduce("colors - ", (e1, e2) -> e1 + e2);
        System.out.println(r);
    }

    public void concatenate2() {
        String r = String.valueOf(colors1.stream()
                .reduce(String::concat));
        System.out.println(r);
    }

    public void concatenate3() {
        String sum = colors1.stream()
                .reduce("colors - ", String::concat);
        System.out.println(sum);
    }

    public void multiply() {
        Optional<Integer> r = numbers.stream()
                .reduce((x,y)->x*y);
        System.out.println(r);
    }

    public static void main(String[] args) {
        Reduce reduce = new Reduce();

        reduce.summarize();
        reduce.summarize2();
        reduce.concatenate1();
        reduce.concatenate2();
        reduce.concatenate3();
        reduce.multiply();
    }
}
