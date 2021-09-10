package circus.animal;

<<<<<<< HEAD:src/main/java/circus/animal/Parrot.java
import circus.Asset;

public class Parrot extends Bird implements Asset {
=======
public class Parrot extends Bird {
>>>>>>> origin/improved:src/main/java/Parrot.java
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public int getValue() {
        return 20;
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }


}
