package Models;

import Service.Teaching;

public class Teacher extends Staff implements Teaching {

    private String subject;

    public Teacher() {}
    public Teacher(long id, String name) {
        super(id, name);
    }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }

    @Override
    public String toString() {
        return String.format("This is teacher with id = %s, name = %s, rating =%s", super.getId(), super.getName(), super.getRating());
    }

}
