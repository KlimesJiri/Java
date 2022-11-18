package inheritance.school;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // FINAL TEST PROVIDED
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();


        /*          *** MY OWN TESTING CODE ***
        Person person = new Person("Joe Mama", 69, "email");
        person.introduce();
        person.getGoal();
        System.out.println();

        Student student = new Student();
        student.introduce();
        student.getGoal();
        student.skipDays(5);
        student.introduce();
        System.out.println();

        Student student1 = new Student("Joe Tata", 420, "gmail", "Chocolate Factory");
        student1.introduce();
        student1.getGoal();
        student1.skipDays(360);
        student1.introduce();
        System.out.println();

        Mentor mentor = new Mentor();
        mentor.getGoal();
        mentor.introduce();

        Mentor mentor2 = new Mentor("Joe Brother", 666, "BigMac", "junior");
        mentor2.getGoal();
        mentor2.introduce();
        */

    }
}
