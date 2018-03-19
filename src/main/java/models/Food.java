package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Food extends Consumable {

    private String mealType;
    private FoodCategory foodCategory;
    private Meal meal;



    public Food(String name, NutritionalRating nutritionalRating, int calories, int quantity, String mealType, FoodCategory foodCategory, Meal meal) {
        super(name, nutritionalRating, calories, quantity);
        this.mealType = mealType;
        this.foodCategory = foodCategory;
        this.meal = meal;
    }

    public Food() {
    }

    @Column(name = "meal_type")
    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Column(name = "food_category")
    public FoodCategory getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }

    @ManyToOne
    @JoinColumn(name = "meal_id", nullable = false)
    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }




}


