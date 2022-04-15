package Implementation;

//import Models.Staff;
import Models.*;

import java.util.ArrayList;

import static Models.StaffGenerator.generateStaff;

public class TestUniversity {

    public static void main(String[] args) {

        ArrayList<Staff> staff = generateStaff(50);
        Staff staff1 = staff.get(0);

        //System.out.println("This is Staff object - " + staff1);

        for (Staff staffToPrint : staff) {
//            System.out.println(String.format("This is student with id = %s and name = %s", staffToPrint.getId(), staffToPrint.getName()));
            System.out.println(staffToPrint);
        }

        int numTeachers = 0;
        int numStudents = 0;
        int numPostgraduates = 0;

        int lengthOfArrayList = staff.size();

        Staff firstElement = staff.get(0);

        Staff secondElement = staff.get(2);

//        for (int i = 0; i <staff.size() ; i++) {
//            Staff element = staff.get(i);
//
//            if (element instanceof Student) {numStudents++;}
//            else if (element instanceof Teacher) {numTeachers++;}
//            else if (element instanceof Postgraduate) {numPostgraduates++;}
//        }

        for (Staff element : staff) {
            if (element instanceof Student) {numStudents++;}
            else if (element instanceof Teacher) {numTeachers++;}
            else if (element instanceof Postgraduate) {numPostgraduates++;}
        }
        System.out.println("Number of students = " + numStudents);
        System.out.println("Number of teachers = " + numTeachers);
        System.out.println("Number of postgraduates = " + numPostgraduates);

        Staff studentJohn = staff.get(50); // 77 and John
        Staff anotherJohn = new Student(77, "John1");

        System.out.println("== " + (studentJohn == anotherJohn));
        System.out.println("equals " + (studentJohn.equals(anotherJohn)));

        // if( == )
        // if( equals )

        // подсчитать сколько всего студентов, сколько аспирантов, сколько учителей. +
        //toString() переопределить у всех объектов - студентов, аспирантов, учителей. +

//        System.out.println(String.format("This is student with id = %s and name = %s", staff1.getId(), staff1.getName()));

    }
}
// Create class automatic generator students, teachers and postgraduates
// ArrayList<Staff> generateStaff(int quantity); 100, id ordered from 0 to 100
// class StaffGenerator - static ArrayList<Staff> generateStaff(int quantity);
// случайным образом создавать студентов, препов и аспирантов. из расчета 5 студентов, 1 преп, 2 аспиранта
//        ArrayList<Staff> staffList = StaffGenerator.generateStaff(50);
//        using instanseOf and typecast, подсчитаешь сколько на самом деле студентов, препов и аспирантов.