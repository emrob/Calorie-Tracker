package models;

public class Food extends Consumable {

    private String mealType;
    private FoodType foodType;

    public Food(String name, String nutritionalRating, int calories, String mealType, FoodType foodType) {
        super(name, nutritionalRating, calories);
        this.mealType = mealType;
        this.foodType = foodType;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
