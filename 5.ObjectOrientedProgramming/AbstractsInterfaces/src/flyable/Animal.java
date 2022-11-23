package flyable;

public abstract class Animal {

    public Animal(String name) {
        this.name = name;
    }

    protected String name;
    protected int age;

    protected String gender;
    protected String size;
    protected int numberOfLegs;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String breed();

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
}
