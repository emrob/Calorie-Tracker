package models;

import behaviours.IConsume;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Consumable implements IConsume {
    private int id;
    private String name;
    private NutritionalRating nutritionalRating;
    private int calories;
    private int quantity;

    public Consumable(String name, NutritionalRating nutritionalRating, int calories, int quantity){
    this.name = name;
    this.nutritionalRating = nutritionalRating;
    this.calories = calories;
    this.quantity = quantity;
    }

    public Consumable(){

        }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="nutritional_rating")
    public NutritionalRating getNutritionalRating() {
        return nutritionalRating;
    }

    public void setNutritionalRating(NutritionalRating nutritionalRating) {
        this.nutritionalRating = nutritionalRating;
    }

    @Column(name="calories")
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Column(name="quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculateCalories(){
        return this.quantity * this.calories;
    }
}

