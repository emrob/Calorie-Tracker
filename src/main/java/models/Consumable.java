package models;

public abstract class Consumable {
    private int id;
    private String name;
    private NutritionalRating nutritionalRating;
    private int calories;

    public Consumable(String name, NutritionalRating nutritionalRating, int calories){
    this.name = name;
    this.nutritionalRating = nutritionalRating;
    this.calories = calories; }

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
}

