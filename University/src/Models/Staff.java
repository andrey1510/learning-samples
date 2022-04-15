package Models;

public class Staff {
    private long id;
    private String name;

    public Staff() {
        this.id = 0;
        this.name = "Default Student";
    }

    public Staff(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("This is staff with id = %s and name = %s", id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Staff that = (Staff) obj;
        return  (id == that.id) && (name == that.name);
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person that = (Person) o;
//        return firstName.equals(that.firstName) &&
//                lastName.equals(that.lastName);
    }
}








