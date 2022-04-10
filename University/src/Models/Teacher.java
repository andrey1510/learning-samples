package Models;

import Service.Teaching;

public class Teacher extends Staff implements Teaching {
//    ToDo - make this field private with getters and setter
    String subject;


    //Add Constructor one or two
    @Override
    public void teach() {
        System.out.println("Teacher teaching");
    }
}
