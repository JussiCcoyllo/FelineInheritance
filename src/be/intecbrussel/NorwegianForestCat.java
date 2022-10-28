package be.intecbrussel;

public class NorwegianForestCat extends Felis{

    public NorwegianForestCat(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    public void miauwInNorvegian() {
        System.out.println("Special miawuw");
    }

    @Override
    public String toString() {
        return "NorwegianForestCat{}"
                +super.toString();
    }
}

