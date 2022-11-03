package oop.fudnamentals.teacherstudent;

public class Student {

    public void learn(){
        System.out.println("The student is actually learning");
    }

    public void question(Teacher teacher){
        teacher.giveAnswer();
    }
}
