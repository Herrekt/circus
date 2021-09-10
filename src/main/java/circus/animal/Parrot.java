package circus.animal;

import circus.Asset;

public class Parrot extends Bird implements Asset {

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
