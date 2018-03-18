package models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Drink extends Consumable{
    private int size;
    public Drink(String name, NutritionalRating nutritionalRating, int calories, int quantity, int size) {
        super(name, nutritionalRating, calories, quantity);
        this.size = size;
    }

    @Column(name="size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
