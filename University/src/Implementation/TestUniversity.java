package Implementation;

//import Models.Staff;
import Models.*;

import java.util.*;
import java.util.stream.Collectors;

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
            System.out.println("================== Please enter quantity of staff. ==================");

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

            printStaff(staff);

            System.out.println("================== Staff list ==================" );
            System.out.println("Number of students = " + numStudents);
            System.out.println("Number of teachers = " + numTeachers);
            System.out.println("Number of postgraduates = " + numPostgraduates);

            //Staff studentJohn = staff.get(staff.size() -1); // 77 and John
            //Staff anotherJohn = new Student(77, "John");

            //System.out.println("== " + (studentJohn == anotherJohn));
            //System.out.println("equals " + (studentJohn.equals(anotherJohn)));
//    } catch (InvalidQuantityException ex) {
//        System.out.println(ex.getMessage());
//        System.out.println("Please enter another quantity");
//        // write  logic  to enter another  quantity and generateStaff()
//

            Comparator<Staff> comp1=Comparator.comparing(Staff::getRating); //lambda
            Collections.sort(staff,comp1);
            System.out.println("================== Sorting by rating ascending ==================");
            printStaff(staff);

            Comparator<Staff> comp2=Comparator.comparing(Staff::getId); //lambda
            Collections.sort(staff,comp2.reversed());
            System.out.println("================== Sorting by ID descending ==================");
            printStaff(staff);

            RatingComparator comparator = new RatingComparator();
            Collections.sort(staff,comparator);
            System.out.println("================== Sorting by class comparator ==================");
            printStaff(staff);

            ArrayList<Student> studentList = new ArrayList<>();
//            System.out.println("\n================== Students filter ==================");
//            for (Staff element : staff) {
//                    if (element instanceof Student) {
//                        studentList.add((Student) element); //Staff
//                    }
//            }

            int studentsWithCount = getStudentsWithCount(staff, studentList);

            System.out.println("Найдено студентов - " + studentsWithCount);

            for (Staff studentToPrint : studentList)    {
                    System.out.println(studentToPrint);
            }

            System.out.println("\n================== Students filter with lambdas ==================");

            List<Student> collect = staff.stream()
                    .filter(e -> e instanceof Student)
                    .map(e -> (Student) e)
                    .collect(Collectors.toList());

            collect.stream().forEach(System.out::println);

            System.out.println("================== Staff after change ==================");
            printStaff(staff);
            System.out.println("================== Staff after assignment ==================");

            ArrayList<Staff> new_staff = new ArrayList<>();
            new_staff.add(new Teacher(100, "Cleaver Teacher"));
            staff = new_staff;
            printStaff(staff);
            //DRY Do not repeat yourself


            //System.out.println(studentList);
            // There is Staff arraylist. Iterate through list, filter Student and add Student to ArrayList.
            // As output you should receive ArrayList<Student> -> then print it.




    } catch (Exception ex) {
        System.out.println(ex.getMessage());
        System.out.println("================== Please enter another quantity ==================");
        // write  logic  to enter another  quantity and generateStaff()
            //ToDo - move up try/catch

    }
        System.out.println("================== Another code ==================");

    }

    private static void printStaff(ArrayList<Staff> staff) {
        for(Staff staffToPrint : staff){
            System.out.println(staffToPrint);
        }
    }

    private static int getStudentsWithCount(ArrayList<Staff> staff, ArrayList<Student> studentList) {
        System.out.println("\n================== Students filter ==================");
        for (Staff element : staff) {
            if (element instanceof Student) {
                studentList.add((Student) element); //Staff
            }
        }

        staff.add(new Teacher(100, "Cleaver Teacher"));
        Staff staff0 = staff.get(0);
        staff0.setName(staff0.getName() + "_changed");
        ArrayList<Staff> new_staff = new ArrayList<>();
        new_staff.add(new Teacher(100, "Cleaver Teacher"));
        staff = new_staff;

        return (int) studentList.stream().count();
    }
}



/*
* 1. Написать компаратор, и сравнить студентов по IQ
* 2. Написать еще компаратор и вывести список студентов по Id в убывающем порядке.
**/
