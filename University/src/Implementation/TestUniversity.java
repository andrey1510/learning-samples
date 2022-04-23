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


    }
}

/*
* Задание. В университете должно быть не больше 30 человек. Создать пакет - exception.
* Create custom Exception - UniversityLimitException. Use this UniversityLimitException in StaffGenerator.generateStaff()
* to check if number less than 30
* */

/*
* 1. Написать компаратор, и сравнить студентов по IQ
* 2. Написать еще компаратор и вывести список студентов по Id в убывающем порядке.
**/
