package Models;

import Service.Studying;
import Service.Teaching;

class Postgraduate extends Staff implements Studying, Teaching {

    int yearOfStudy;
    int subject;

    @Override
    public void study() {
        System.out.println("Postgraduate studying");
    }

    @Override
    public void teach() {
        System.out.println("Postgraduate teaching");
    }
}
