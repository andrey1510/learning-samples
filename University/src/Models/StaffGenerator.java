package Models;

import java.util.ArrayList;


public class StaffGenerator {
    public static void main(String[] args) {

    ArrayList<String> nameList = new ArrayList<String>();
    String name1 = new String ("Rikki");
    String name2 = new String ("Tikki");
    String name3 = new String ("Tavi");
    nameList.add(name1);
    nameList.add(name2);
    nameList.add(name3);

    }

}

// Create class automatic generator students, teachers and postgraduates
// ArrayList<Staff> generateStaff(int quantity); 100, id ordered from 0 to 100
// class StaffGenerator - static ArrayList<Staff> generateStaff(int quantity);
// случайным образом создавать студентов, препов и аспирантов. из расчета 5 студентов, 1 преп, 2 аспиранта
//        ArrayList<Staff> staffList = StaffGenerator.generateStaff(50);
//        using instanseOf and typecast, подсчитаешь сколько на самом деле студентов, препов и аспирантов.