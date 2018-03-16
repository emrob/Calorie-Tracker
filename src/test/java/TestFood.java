import models.Food;
import models.FoodCategory;
import models.NutritionalRating;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFood {

     Food food;

     @Before
     public void before(){
         food = new Food("Bread", NutritionalRating.Yellow, 100, "Side", FoodCategory.Carbohydrate);
     }

     @Test
     public void checkName() {
         assertEquals("Bread", food.getName());
    }

    @Test
    public void checkRating() {
         assertEquals(NutritionalRating.Yellow, food.getNutritionalRating());
    }

    @Test
    public void checkCalories() {
         assertEquals(100, food.getCalories());
    }

    @Test
    public void checkMealType() {
         assertEquals("Side", food.getMealType());
    }

    @Test
    public void checkFoodCat(){
         assertEquals(FoodCategory.Carbohydrate, food.getFoodCategory());
    }
}
