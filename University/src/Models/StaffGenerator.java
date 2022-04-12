package Models;

import java.util.ArrayList;


// Utility Class - like functions, no internal state

public class StaffGenerator {
    public static ArrayList<Staff> generateStaff(int quantityStaff) {

        ArrayList<Staff> nameList = new ArrayList<>();

//        Staff student = new Student(1, "John");
//        nameList.add(student);

        for (int i = 0; i < quantityStaff; i++) {
            int random = (int) (10 * Math.random()); // 0 -10
            if (random < 6) {
                //Add Student
                 nameList.add(new Student(i, "John"));
            }
            else if(random <8) {
                //Add Postgrad
                 nameList.add(new Postgraduate(i, "Bill"));
            } else {
                //Teacher
                 nameList.add(new Teacher(i, "Baiden"));
            }

        }


        return nameList;


    }

}

// Create class automatic generator students, teachers and postgraduates
// ArrayList<Staff> generateStaff(int quantity); 100, id ordered from 0 to 100
// class StaffGenerator - static ArrayList<Staff> generateStaff(int quantity);
// случайным образом создавать студентов, препов и аспирантов. из расчета 5 студентов, 1 преп, 2 аспиранта
//        ArrayList<Staff> staffList = StaffGenerator.generateStaff(50);
//        using instanseOf and typecast, подсчитаешь сколько на самом деле студентов, препов и аспирантов.