package Models;

import Implementation.Studying;
import Implementation.Teaching;

public class Staff {

    long id;
    String name;

}

class Student extends Staff implements Studying {

    int courseNumber;

    @Override
    public void study() {

    }
}

class Teacher extends Staff implements Teaching {

    String subject;

    @Override
    public void teach() {
        
    }
}

class Postgraduate extends Staff implements Studying, Teaching {

    int yearOfStudy;
    int subject;

    @Override
    public void study() {

    }

    @Override
    public void teach() {

    }
}

