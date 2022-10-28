package be.intecbrussel;

public class TurkishVanCat extends Felis{

    public TurkishVanCat(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    public String nickname(){
        return "Hohoho";

    }

    @Override
    public String toString() {
        return "TurkishVanCat{}";
    }
}
