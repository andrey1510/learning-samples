package Implementation;

import Models.Staff;
import Models.StaffGenerator;

import java.util.ArrayList;

import static Models.StaffGenerator.generateStaff;

public class TestUniversity {

    public static void main(String[] args) {

        ArrayList<Staff> staff = generateStaff(50);
        Staff staff1 = staff.get(0);

        System.out.println("This is Staff object - " + staff1);

        for (Staff staffToPrint : staff) {
//            System.out.println(String.format("This is student with id = %s and name = %s", staffToPrint.getId(), staffToPrint.getName()));
            System.out.println(staffToPrint);
        }

        // подсчитать сколько всего студентов, сколько аспирантов, сколько учетелей.
        //toString() переопределить у всех объектов - студентов, аспирантов, учетелей.

//        System.out.println(String.format("This is student with id = %s and name = %s", staff1.getId(), staff1.getName()));

    }
}
// Create class automatic generator students, teachers and postgraduates
// ArrayList<Staff> generateStaff(int quantity); 100, id ordered from 0 to 100
// class StaffGenerator - static ArrayList<Staff> generateStaff(int quantity);
// случайным образом создавать студентов, препов и аспирантов. из расчета 5 студентов, 1 преп, 2 аспиранта
//        ArrayList<Staff> staffList = StaffGenerator.generateStaff(50);
//        using instanseOf and typecast, подсчитаешь сколько на самом деле студентов, препов и аспирантов.