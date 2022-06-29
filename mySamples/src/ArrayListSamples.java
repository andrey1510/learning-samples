import java.util.*;

public class ArrayListSamples {

    /////////////////////// Declaring, initializing and filing Array List /////////////////////

    List<String> colors0 = Arrays.asList("Violet", "Purple");  // fixed list (its size cannot be changed!) created by factory method; import of java.util.Arrays is required

    List<String> colors3 = new ArrayList<>(Arrays.asList("Violet", "Purple"));  // creating normal list (its size can be changed) by factory method

    List<String> colors2 = new ArrayList<>(){{  // declaring and initializing array list and adding elements via instance block
        add("White");           // adding 1 new element to the end of the list
        add(1, "Gray");    // adding 1 new element to the specified position
        add("Black");
        addAll(colors3);        // adding (copying) all elements from another collection to the end of the list
        addAll(0, colors3);        // adding (copying) all elements from another collection to the end of the list
    }};

    List<String> colors5 = new ArrayList<>(colors3); // declaring array list and initializing it with elements from another collection

    List<Integer> numbers = new ArrayList<>();  // in case primitives, argument may be only wrapped
    public void addNumbers() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
    }


    public static void main(String[] args) {
        ArrayListSamples t = new ArrayListSamples();
        t.addNumbers();


        ArrayList<String> colors1 = new ArrayList<>();  // declaring and initializing empty array list
        colors1.add("Red");       // adding element to the end of the list
        colors1.add("Green");
        colors1.add("Blue");
        colors1.add(0,"Yellow"); // adding 1 new element to the specified position

        ArrayList<String> colors4 = new ArrayList<>(1000);  // array list with initial capacity allocated to it when created; default capacity os 10 elements

    /////////////////////////////////////// List from other  sources ////////////////////////////////

        String s6 = "fgfd rgdf dfgd";
        List<String> arr = Arrays.asList(s6.split(" "));


    /////////////////////// Removing elements from Array List /////////////////////

        colors1.remove("Blue");   // removing element from array list by element (only first element with such value)
        colors1.remove(1);   // removing element from array list at the specified position in index
        t.colors2.removeAll(t.colors3); // removing all elements previously added (copied) from another collection, it shall be indicated in parentheses
        t.numbers.removeIf(n -> (n < 8));   // removing elements on condition
        t.colors3.clear();            //  removing all elements from array list

    /////////////////////// Changing elements in Array List /////////////////////

        colors1.set(0, "Colorless");  // replace element at the specified position in index

    /////////////////////// Reversing Array List /////////////////////

        Collections.reverse(colors1);  // elements may be reversed using invocation of reverse() by Collections class; java.util.Collections must be imported

    //////////////////...///// Size and search ////////////////////...../

        System.out.println(colors1.size());  // size() returns the number of elements in this list
        System.out.println(colors1.get(0));  // get() returns the element at the specified position in this list.
        System.out.println(colors1.contains("Green"));  // Returns true if this list contains the specified element.


        System.out.println(colors1);
        System.out.println(t.colors2);
        System.out.println(t.colors3);
        System.out.println(colors4);
        System.out.println(t.colors5);
        System.out.println(t.numbers);
    }
}

//////////////////////////// Iterators ///////////////////////////

class ArrayListIterators {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
        }};

        // Iterator sample (while):
        Iterator<Integer> itr1 = numbers.iterator();  // creating iterator; import of  java.util.Iterator is needed
        while(itr1.hasNext()){ // condition to end loop
            System.out.println(itr1.next()); // printing element and moving to next
        }

        // Iterator sample (enhanced for)):
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Iterator sample (for)):
        for(int i=0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        // Iterator sample (forEach, lambda)):
        numbers.forEach(System.out::println);

        // Iterator sample (forEach, stream)):
        numbers.stream().forEach((n) -> System.out.println(n));

    }


}


