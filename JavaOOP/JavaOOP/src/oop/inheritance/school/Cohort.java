package oop.inheritance.school;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    void addStudent(Student student){
        students.add(student);
    }

    void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

    Cohort(String name){
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }
}

/*
Create a Cohort class that has the following

    fields:
        name: the name of the cohort
        students: a list of Students
        mentors: a list of Mentors
    methods:
        addStudent(Student): adds the given Student to students list
        addMentor(Mentor): adds the given Mentor to mentors list
        info(): prints "The name cohort has students.size() students and mentors.size() mentors."

The Cohort class has the following constructors:

    Cohort(name): beside the given parameter it sets students and mentors to empty lists
 */