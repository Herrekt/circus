package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        //train(new Parrot());
        Bird b1 = new Parrot();
        Parrot p1 = (Parrot) b;
        p1.speak();

        // why they all say quack quack cause the underlying class is still duck. It recognizes that the underlying object
        // is still a duck (casting/polymorphism).

        // you can do downcasting, but there are caveats. Even if we cast the type from duck to animal and run bird/duck
        // codes, they'll still run them as duck is still the underlying code.
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        Duck d = (Duck) bird;
        d.swim();
    }
}
