package Models;

import Service.Studying;

public class Student extends Staff implements Studying {
    private int courseNumber;

    //Add Constructor one or two
    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }



    @Override
    public void study() {
        System.out.println("Student studying");
    }
}
