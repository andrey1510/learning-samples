//https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java

public class KeepHydrated {

    public int Liters(double time)  {
        return (int) time/2;
    }

    public static void main(String[] args) {            // test
        KeepHydrated test = new KeepHydrated();
        System.out.println(test.Liters(2.5));
    }

}
