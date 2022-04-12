package Models;

import Service.Studying;
import Service.Teaching;

class Postgraduate extends Staff implements Studying, Teaching {

    private int yearOfStudy;
    private int subject;

    public int getYearOfStudy() { return yearOfStudy;  }
    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }
    public int getSubject() { return subject; }
    public void setSubject(int subject) { this.subject = subject; }

    @Override
    public void study() { System.out.println("Postgraduate is studying"); }

    @Override
    public void teach() { System.out.println("Postgraduate is teaching"); }
}
