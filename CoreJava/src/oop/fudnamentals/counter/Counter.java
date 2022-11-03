package oop.fudnamentals.counter;

public class Counter {
    /*
    Create Counter class
        which has a counter (integer) field
            at creation it should have a default value 0
        there are two ways to create the class:
            with 0 input parameters
            with 1 input parameter called counter which is set as the initial value of the counter field
        we can add another whole number to this counter: add(number)
        we can just increase the counter's value by one: add() (no parameters)
        we can get() the current counter value
        and we can reset() the counter to the initial value set during the construction of the class
    Check if everything works fine with the proper tests:
        Download CounterTest.java and place it next to your solution
        If you are unsure about how to get this running, you can watch a video tutorial
        Other hints for running:
            If something gets red:
                Windows, Linux:
                    press ALT+Enter and add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
                OSX:
                    press ⌥⏎ and add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
            Run the tests one by one with the green play button before the method name (or run all of by pressing the button before the classname)
     */

    private int counter;
    private int startValue;

    public Counter(){
        counter = 0;
        startValue = 0;
    }
    public Counter(int counter){
        this.counter = counter;
        startValue = counter;
    }

    public void add(int addition){
        counter += addition;
    }
    public void add(){
        counter++;
    }

    public int get() {
        return counter;
    }

    //    and we can reset() the counter to the initial value set during the construction of the class
    public void reset() {
        counter = startValue;
    }
}
