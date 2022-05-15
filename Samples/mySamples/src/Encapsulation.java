public class Encapsulation {

    /*Encapsulation (data hiding) is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
      In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
      Any class that wants to access the variables should access them through getters and setters methods which the access points.
      Sample below: */

    // Declaring of the variable of a class as private.
    private int id;

    // Providing public getter method to view the variable value from the other class.
    public int getId() {
        return id;
    }

    // Providing public setter method to modify the variable value from the other class.
    public void setId(int id) {
        this.id = id;
    }
}

class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulation t1 = new Encapsulation();     // Creating instance of the encapsulated class.
        t1.setId(4);                                // Setting value of private variable using setter.
        System.out.println("ID is " + t1.getId());  // Getting value of private variable using getter.
    }

}