package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Food extends Consumable {

    private String mealType;
    private FoodCategory foodCategory;

    public Food(String name, NutritionalRating nutritionalRating, int calories, int quantity, String mealType, FoodCategory foodCategory) {
        super(name, nutritionalRating, calories, quantity);
        this.mealType = mealType;
        this.foodCategory = foodCategory;
    }

    public Food() {
    }

    @Column(name="meal_type")
    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Column(name="food_category")
    public FoodCategory getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }
}
