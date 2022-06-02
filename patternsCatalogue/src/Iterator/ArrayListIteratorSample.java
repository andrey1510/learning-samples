package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ToDo public
public class ArrayListIteratorSample {
    List<String> list1 = new ArrayList<>();
    String s1 = "s1";
    String s2 = "s2";
    String s3 = "s3";
    public void fillList(){
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
    }

    public Iterator<String> createIterator(){
        return list1.iterator();
    }
    public void printIterator() {
        Iterator list1Iterator = createIterator();
        System.out.println(list1Iterator);
    }

    public static void main(String[] args) {
        ArrayListIteratorSample test1 = new ArrayListIteratorSample();
        test1.fillList();
        test1.printIterator();
    }


}
