package Implementation;

//import Models.Staff;
import Models.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Models.InvalidQuantityException;
import static Models.StaffGenerator.generateStaff;

public class TestUniversity {


    public static void main(String[] args)  {
//
//        ArrayList<Staff> staff = generateStaff(50);
//        if (staff == null) {
//            return;
//        } // variant 3


        try {

            Scanner sc=new Scanner(System.in);

            ArrayList<Staff> staff = null;
            System.out.println("Please enter quantity of staff.");

            staff = generateStaff(sc.nextInt());

            Staff staff1 = staff.get(0);

            //System.out.println("This is Staff object - " + staff1);


            int numTeachers = 0;
            int numStudents = 0;
            int numPostgraduates = 0;

            int lengthOfArrayList = staff.size();

            //Staff firstElement = staff.get(0);

            //Staff secondElement = staff.get(2);

            for (int i = 0; i <staff.size() ; i++) {
                Staff element = staff.get(i);

                if (element instanceof Student) {numStudents++;}
                else if (element instanceof Teacher) {
                    numTeachers++;
                    //staff.remove(i);
                }
                else if (element instanceof Postgraduate) {numPostgraduates++;}
            }

//            for (Staff element : staff) {
//                if (element instanceof Student) {numStudents++;}
//                else if (element instanceof Teacher) {
//                    numTeachers++;
//                }
//                else if (element instanceof Postgraduate) {numPostgraduates++;}
//            }

            for (Staff staffToPrint : staff) {
                //            System.out.println(String.format("This is student with id = %s and name = %s", staffToPrint.getId(), staffToPrint.getName()));
                System.out.println(staffToPrint);
            }

            System.out.println("Number of students = " + numStudents);
            System.out.println("Number of teachers = " + numTeachers);
            System.out.println("Number of postgraduates = " + numPostgraduates);

            Staff studentJohn = staff.get(staff.size() -1); // 77 and John
            Staff anotherJohn = new Student(77, "John");

            System.out.println("== " + (studentJohn == anotherJohn));
            System.out.println("equals " + (studentJohn.equals(anotherJohn)));
//    } catch (InvalidQuantityException ex) {
//        System.out.println(ex.getMessage());
//        System.out.println("Please enter another quantity");
//        // write  logic  to enter another  quantity and generateStaff()
//

            Comparator<Staff> comp1=Comparator.comparing(Staff::getRating);
            Collections.sort(staff,comp1);
            System.out.println("Sorting by rating");
            for(Staff staffToPrint : staff){
                System.out.println(staffToPrint);
            }

            Collections.sort(staff,comp1.reversed());
            System.out.println("Sorting by rating");
            for(Staff staffToPrint : staff){
                System.out.println(staffToPrint);
            }



//    }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
        System.out.println("Please enter another quantity");
        // write  logic  to enter another  quantity and generateStaff()

    }
        System.out.println("Another code");

    }
}



/*
* 1. Написать компаратор, и сравнить студентов по IQ
* 2. Написать еще компаратор и вывести список студентов по Id в убывающем порядке.
**/
