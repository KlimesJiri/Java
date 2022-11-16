package oop.inheritance.school;

public class Mentor extends Person {

    private String level;

    @Override
    void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + level + " mentor.");
    }

    @Override
    void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    Mentor(String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }

    Mentor(){
        this("Jane Doe", 30, "female", "intermediate");
    }
}

/*
Create a Mentor class that has the same fields and methods as the Person class, and has the following additional

    fields:
        level: the level of the mentor (junior / intermediate / senior)
    methods:
        getGoal(): prints "Educate brilliant junior software developers."
        introduce(): prints "Hi, I'm name, a age year old gender level mentor."

The Mentor class has the following constructors:

    Mentor(name, age, gender, level)
    Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
 */