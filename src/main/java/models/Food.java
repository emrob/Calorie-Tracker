package models;

public class Food extends Consumable {

    private String mealType;
    private FoodCategory foodCategory;

    public Food(String name, NutritionalRating nutritionalRating, int calories, String mealType, FoodCategory foodCategory) {
        super(name, nutritionalRating, calories);
        this.mealType = mealType;
        this.foodCategory = foodCategory;
    }


    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public FoodCategory getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }
}
