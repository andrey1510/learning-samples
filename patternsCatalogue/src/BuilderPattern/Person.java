package BuilderPattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    private String name;
    private String surname;

    public static class Builder {

        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }
        public Builder withSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Person build(){
            return newPerson;
        }
    }

    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .build();

        System.out.println(myPerson);
    }

}
