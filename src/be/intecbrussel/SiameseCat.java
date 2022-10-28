package be.intecbrussel;

public class SiameseCat extends Felis{

    public SiameseCat(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    public SiameseCat(int shelterNo, int badgeNo) {
        super(shelterNo, badgeNo);
    }

    public SiameseCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "SiameseCat{}" + super.toString();
    }
}
