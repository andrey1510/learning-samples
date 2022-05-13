package level8;
//https://www.codewars.com/kata/5875b200d520904a04000003/train/java

public class BusSpace {

    public static int enough(int cap, int on, int wait){
        return (wait+on > cap) ? (-1*(cap-on-wait)) : 0;
    }

    public static void main(String[] args) {
        System.out.println(enough(20, 10, 5));
        System.out.println(enough(100, 50, 60));
    }
}
