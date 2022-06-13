public class Sample3 {
    public static void main(String[] args) {
        Sample3Interface str = String::length;
        String title = "fdg4gfdgfhfdje56yjdyt";
        int length = str.getLength(title);
        System.out.println(length);
    }
}

interface Sample3Interface {
    int getLength (String s);
}