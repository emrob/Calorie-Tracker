package models;

public class Drink extends Consumable{
    private int size;
    public Drink(String name, NutritionalRating nutritionalRating, int calories, int size) {
        super(name, nutritionalRating, calories);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
