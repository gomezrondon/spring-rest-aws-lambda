package com.gomezrondon.springrestawslambda.entitie;



public class Employee {


    private Long id;


    private String firstName;

    private String lastName;
    private String primary_skills;
    private String location; // 3 char(3)

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getPrimary_skills() {
        return primary_skills;
    }

    public void setPrimary_skills(String primary_skills) {
        this.primary_skills = primary_skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", primary_skills='" + primary_skills + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
