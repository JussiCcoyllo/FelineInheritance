package be.intecbrussel;

public class Panthera extends Animal{

    public Panthera(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    public String roar(){
        return "roar wild roar";
    }
    public void hunt() {
        System.out.println("Ouch");
    }

    @Override
    public String toString() {
        return "Panthera{}"
                +super.toString();
    }
}
