package oop.inheritance.school;

public class Sponsor extends Person{

    private String company;
    private int hiredStudents;

    @Override
    void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() +
                           " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    void hire(){
        hiredStudents++;
    }

    @Override
    void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        hiredStudents = 0;
    }

    Sponsor(){
        this("Jane Doe", 30, "female", "Google");
        hiredStudents = 0;
    }
}

/*
Create a Sponsor class that has the same fields and methods as the Person class, and has the following additional

    fields:
        company: name of the company
        hiredStudents: number of students hired
    method:
        introduce(): prints "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
        hire(): increases hiredStudents by 1
        getGoal(): prints "Hire brilliant junior software developers."

The Sponsor class has the following constructors:

    Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
    Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0
 */
