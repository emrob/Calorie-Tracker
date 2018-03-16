package models;

public abstract class Consumable {
    private int id;
    private String name;
    private String nutritionalRating;
    private int calories;

    public Consumable(String name, String nutritionalRating, int calories){
    this.name = name;
    this.nutritionalRating = nutritionalRating;
    this.calories = calories; }

//    public Consumerable(){
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

    public String getNutritionalRating() {
        return nutritionalRating;
    }

    public void setNutritionalRating(String nutritionalRating) {
        this.nutritionalRating = nutritionalRating;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
}
