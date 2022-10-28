package be.intecbrussel;

public class Animal {
    private char size;
    private char coat;
    private String color;
    private double weight;
    protected static int animalCount=0;

    {animalCount++;}
    public Animal(){
    }

    public void makeNoise(String sound) {

        System.out.println("Special sound");
    }

    public Animal(char size, char coat, String color, double weight) {
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Wild eat");

    }

    public void sleep() {
        System.out.println("Shuutt animal is sleeping");
    }

    public boolean isAlive() {
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
