
public class Sample1 {
    void print() {
        System.out.println("Test print");
    }

    public static void main(String[] args) {
        Sample1 t1 = new Sample1();
        t1.print();

        Runnable r = () -> System.out.println("Test print lambda");
        r.run();
    }


}
