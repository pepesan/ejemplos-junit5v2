package example;

public class Person {
    public String firstName;
    public String lastName;
    public Person(String name, String surname){
        this.firstName= name;
        this.lastName = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
