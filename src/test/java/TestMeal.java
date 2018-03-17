import models.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

public class TestMeal {

    Meal meal;
    Food food;
    Drink drink;

    @Before
    public void before(){
        meal = new Meal(new GregorianCalendar(2018,3,12), 2000);
        drink = new Drink("Milkshake", NutritionalRating.Red,500, 1, 600);
        food = new Food("Bread", NutritionalRating.Yellow, 100, 2, "Side", FoodCategory.Carbohydrate);
    }

    @Test
    public void canGetDate(){
        assertEquals(new GregorianCalendar(2018,3,12), meal.getDate());
    }

    @Test
    public void canGetDailyCalorieAllowance(){
        assertEquals(2000, meal.getDailyCalorieAllowance());
    }

    @Test
    public void  canSetDailyCalorieAllowance(){
        meal.setDailyCalorieAllowance(1800);
        assertEquals(1800, meal.getDailyCalorieAllowance());
    }

    @Test
    public void testMealsStartEmpty(){
        assertEquals(0, meal.getMealSize());

    }

    @Test
    public void testCanAddToMeal(){
        meal.addFood(food);
        meal.addDrink(drink);
        assertEquals(2, meal.getMealSize());
    }

    @Test
    public void testCaloriesOfMeal(){
        meal.addFood(food);
        meal.addDrink(drink);
        assertEquals(700, meal.getCalorieTotal());
    }

    @Test
    public void testHowManyCaloriesLeftForTheDay(){
        meal.addFood(food);
        meal.addDrink(drink);
        assertEquals(1300, meal.caloriesLeftToUse());

    }
}
