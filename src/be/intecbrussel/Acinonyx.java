package be.intecbrussel;

public class Acinonyx extends Animal{
    private double speed;

    public Acinonyx(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);

    }

    public void run(double distance) {
        System.out.println("Acinonyx runs fast to " + distance + " km" );
    }

    public void kiauuww() {
        System.out.println("special kiauww");

    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                "speed=" + speed +
                '}'+super.toString();
    }
}
