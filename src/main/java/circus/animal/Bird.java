package circus.animal;

public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }
    // if you make a method abstract, you have to make the class abstract. Not the other way round.
}
