package Models;

import java.util.ArrayList;



// Utility Class - like functions, no internal state

public class StaffGenerator {


    public static ArrayList<Staff> generateStaff(int quantityStaff) /*throws InvalidQuantityException */{

        //String[] name = new String[]{"Ryan", "Josh", "Edward", "Piter", "Chris", "Kevin", "Sean", "Nick", "William"};
        //int length = name.length;

        int  limit = 30;
//        if (quantityStaff >limit) {
//            String errMes = String.format("QuantityStaff = %s exceeded limit  = %s", quantityStaff, limit);
//            throw  new RuntimeException(errMes); //  variant 1
////            throw new InvalidQuantityException(errMes); //  variant 2
//        }
        if (quantityStaff >limit) {
            return null;
        }
        ArrayList<Staff> nameList = new ArrayList<>();

//        Staff student = new Student(1, "John");
//        nameList.add(student);

        for (int i = 0; i < quantityStaff; i++) {

            double randomDouble = 10 * Math.random();
            int random = (int) randomDouble; // 0 -10

            if (random < 6) {
                //Add Student
                Student student = new Student(i, "John");
                student.setRating(20 * randomDouble);
                nameList.add(student);
            }
            else if(random <8) {
                //Add Postgrad
                //ToDo - same as student +
                 Postgraduate postgraduate = new Postgraduate(i, "Bill");
                 postgraduate.setRating(20 * randomDouble);
                 nameList.add(postgraduate);
            } else {
                //Teacher
                //ToDo - same as student +
                 Teacher teacher = new Teacher(i, "Brandon");
                 teacher.setRating(20 * randomDouble);
                 nameList.add(teacher);
            }

        }
        nameList.add(new Student(77, "Jack"));
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