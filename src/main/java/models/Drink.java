package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Drink extends Consumable{
    private int size;
    private Meal meal;

    public Drink() {
    }

    public Drink(String name, NutritionalRating nutritionalRating, int calories, int quantity, int size, Meal meal) {
        super(name, nutritionalRating, calories, quantity);
        this.size = size;
        this.meal = meal;
    }

    @Column(name="size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @ManyToOne
    @JoinColumn(name="meal_id", nullable = false)
    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
