package Models;

import Service.Studying;

public class Student extends Staff implements Studying {

    private int courseNumber;

    public Student() {}
    public Student(long id, String name) {
        super(id, name);
    }

    public int getCourseNumber() {
        return courseNumber;
    }
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public String toString() {
        return String.format("This is student with id = %s, name = %s, rating =%s",
                super.getId(), super.getName(), super.getRating());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student that = (Student) obj;
        return  (super.getId() == super.getId());
    }
}
