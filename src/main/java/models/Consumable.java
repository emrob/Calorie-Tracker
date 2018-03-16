package models;

import behaviours.IConsume;

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

//    public Consumable(){
//
//        }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NutritionalRating getNutritionalRating() {
        return nutritionalRating;
    }

    public void setNutritionalRating(NutritionalRating nutritionalRating) {
        this.nutritionalRating = nutritionalRating;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

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

