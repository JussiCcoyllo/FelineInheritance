package be.intecbrussel;

public class PersianCat extends Felis{

    public PersianCat(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }


    public PersianCat(int shelterNo, int badgeNo) {
        super(shelterNo, badgeNo);
    }


    public void miauw() {
        System.out.println("Miauwwwwuww");
    }

    @Override
    public String toString() {
        return "PersianCat{}" + super.toString();
    }
}
