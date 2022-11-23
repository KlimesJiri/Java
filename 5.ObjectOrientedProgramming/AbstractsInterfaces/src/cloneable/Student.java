package cloneable;

public class Student extends Person implements Cloneable{

    private String previousOrganization;
    private int skippedDays;

    @Override
    void getGoal() {
        System.out.println("My goal is: Be a junior developer.");
    }

    @Override
    void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge()+ " year old " + getGender() + " from "
        + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    int skipDays(int numberOfDays){
        skippedDays += numberOfDays;
        return skippedDays;
    }

    Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    Student(){
        this("Jane Doe", 30, "female", "School of Life");
    }

    @Override
    public Person clone() {
        return new Student(getName(), getAge(),getGender(),previousOrganization);
    }
}

/*
Create a Student class that has the same fields and methods as the Person class, and has the following additional

    fields:
        previousOrganization: the name of the student’s previous company / school
        skippedDays: the number of days skipped from the course
    methods:
        getGoal(): prints "Be a junior software developer."
        introduce(): prints "Hi, I'm name, an age year old gender from previousOrganization who skipped skippedDays days from the course already."
        skipDays(numberOfDays): increases skippedDays by numberOfDays

The Student class has the following constructors:

    Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
    Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
 */
