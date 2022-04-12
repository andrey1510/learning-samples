package Models;

import Service.Teaching;

public class Teacher extends Staff implements Teaching {

    private String subject;

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }

}
