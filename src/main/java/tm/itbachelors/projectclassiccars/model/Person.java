package tm.itbachelors.projectclassiccars.model;

// Talha Arif - r1066207

public class Person {
    private String firstName;
    private String surName;
    private String nationality;

    public Person() {}

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getNationality() {
        return nationality;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // return owner surname (in capital) and firstname
    @Override
    public String toString() {
        return surName.toUpperCase() + " " + firstName;
    }
}