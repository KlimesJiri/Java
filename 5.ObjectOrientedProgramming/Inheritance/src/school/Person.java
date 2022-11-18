package inheritance.school;

public class Person {

    private String name;
    private int age;
    private String gender;

    void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

    void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person(){
        this("Jane Doe", 30, "female");
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }
}

/*
Create a Person class with the following fields:

    name: the name of the person
    age: the age of the person (whole number)
    gender: the gender of the person (male / female)

And the following methods:

    getGoal(): prints "My goal is: Live for the moment!"
    introduce(): prints "Hi, I'm name, a age year old gender."

And the following constructors:

    Person(name, age, gender)
    Person(): sets name to Jane Doe, age to 30, gender to female

 */
