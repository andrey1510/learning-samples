package Models;

import Service.Studying;
import Service.Teaching;

public class Postgraduate extends Staff implements Studying, Teaching {

    private int yearOfStudy;
    private int subject;

    public Postgraduate() { }
    public Postgraduate(long id, String name) {
        super(id, name);
    }

    public int getYearOfStudy() { return yearOfStudy;  }
    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }
    public int getSubject() { return subject; }
    public void setSubject(int subject) { this.subject = subject; }

    @Override
    public void study() { System.out.println("Postgraduate is studying"); }

    @Override
    public void teach() { System.out.println("Postgraduate is teaching"); }

    @Override
    public String toString() {
        return String.format("This is postgraduate with id = %s, name = %s, rating = %s", super.getId(), super.getName(), super.getRating());
    }

}
