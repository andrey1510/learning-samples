package level8;

//https://www.codewars.com/kata/5302d846be2a9189af0001e4/train/java

public class WelcomeToCity {

    //Variant 1 (StringBuilder)
    public String sayHello(String [] name, String city, String state){
        StringBuilder n = new StringBuilder();
        for (String s : name) {          //for (int i = 0; i < name.length; i++)
            n.append(' ').append(s);
        }
        return "Hello," + n + "! Welcome to " + city + ", " + state + "!";
    }

    //Variant 2 (join)
    public String sayHello2(String [] name2, String city2, String state2){
        return "Hello," + String.join(" ", name2) + "! Welcome to " + city2 + ", " + state2 + "!";
    }

    //Variant 3 (format, join)
    public String sayHello3(String [] name3, String city3, String state3){
        return String.format("Hello,%s! Welcome to %s, %s!", String.join(" ", name3), city3, state3);
    }


    public static void main(String[] args) {

        WelcomeToCity test1 = new WelcomeToCity();        // Variant 1 test
        System.out.println(test1.sayHello(new String[]{"Pyramid","Head"}, "Silent Hill", "Maine"));

        WelcomeToCity test2 = new WelcomeToCity();        // Variant 2 test
        System.out.println(test2.sayHello(new String[]{"Robbie","The", "Rabbit"}, "Silent Hill", "Maine"));

        WelcomeToCity test3 = new WelcomeToCity();        // Variant 3 test
        System.out.println(test3.sayHello(new String[]{"John","Doe"}, "Silent Hill", "Maine"));
    }

}
