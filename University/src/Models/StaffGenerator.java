package Models;

import java.util.ArrayList;


// Utility Class - like functions, no internal state

public class StaffGenerator {
    public static ArrayList<Staff> generateStaff(int quantityStaff) {

        ArrayList<Staff> nameList = new ArrayList<>();

//        Staff student = new Student(1, "John");
//        nameList.add(student);

        for (int i = 0; i < quantityStaff; i++) {

            double randomDouble = 10 * Math.random();
            int random = (int) randomDouble; // 0 -10

            if (random < 6) {
                //Add Student
                Student student = new Student(i, "John");
                student.setIq(10 * randomDouble);
                nameList.add(student);
            }
            else if(random <8) {
                //Add Postgrad
                //ToDo - same as student
                 nameList.add(new Postgraduate(i, "Bill"));
            } else {
                //Teacher
                //ToDo - same as student
                 nameList.add(new Teacher(i, "Baiden"));
            }

        }
        nameList.add(new Student(77, "John"));
        // ToDo - same as student


        return nameList;


    }

}

// Create class automatic generator students, teachers and postgraduates
// ArrayList<Staff> generateStaff(int quantity); 100, id ordered from 0 to 100
// class StaffGenerator - static ArrayList<Staff> generateStaff(int quantity);
// случайным образом создавать студентов, препов и аспирантов. из расчета 5 студентов, 1 преп, 2 аспиранта
//        ArrayList<Staff> staffList = StaffGenerator.generateStaff(50);
//        using instanseOf and typecast, подсчитаешь сколько на самом деле студентов, препов и аспирантов.