public class OOP {
}

//////////////// IS-A, HAS-A  (inheritance, composition, aggregation) ///////////////

// Sample of Inheritance
class Animal {
    String informAnimal () {
        return "I am an Animal";
    }
}
class Cat extends Animal {      // Is-a relationship (inheritance) - cat IS an animal (class Cat inherits class Animal)
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println("I am a Cat and " + c.informAnimal());  // As class Cat inherits class Animal, class Cat creates object of it own class and uses it to call method of Animal class


        Tail t = new Tail();    // Has-a relationship (Association, in this case: Composition) - cat HAS a tail (class Cat has an object of Tail class)
        System.out.println("I am a Cat and " + t.informTail());    // Class Cat creates object of class Tail and uses such object to call method of Tail class.
    }
}
class Tail {
    String informTail() {
        return "I has a Tail.";
    }
}




