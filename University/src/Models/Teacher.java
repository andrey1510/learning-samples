package Models;

import Service.Teaching;

public class Teacher extends Staff implements Teaching {

    private String subject;

    //ToDo 2 Constructor: default and two argument constructor
    public Teacher(long id, String name) {
        super(id, name);
    }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }

}
