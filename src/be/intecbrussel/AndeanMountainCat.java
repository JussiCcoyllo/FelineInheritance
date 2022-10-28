package be.intecbrussel;

public class AndeanMountainCat extends Felis{

    public AndeanMountainCat(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }
    public void miauw(String customSound){

    }
    public  boolean isAlive(){
        return false;
    }

    @Override
    public String toString() {
        return "AndeanMountainCat{}";
    }
}
