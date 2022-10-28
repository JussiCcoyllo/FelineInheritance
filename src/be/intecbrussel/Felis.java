package be.intecbrussel;

import java.util.Objects;

public class Felis extends Animal {
    private static int vaccinationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    {if (isAlive())
        animalCount++;}
    public Felis(char size, char coat, String color, double weight) {
    }

    public Felis(int shelterNo, int badgeNo) {
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public Felis(String name, int age, int shelterNo, int badgeNo) {
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public void miauw() {

    }

    public void miauw(int times) {

    }

    public static int getVaccinationCats() {
        return animalCount;
    }

    public static void setVaccinationCats(int vaccinationCount) {
        Felis.animalCount = animalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                '}' + super.toString();
    }

}


