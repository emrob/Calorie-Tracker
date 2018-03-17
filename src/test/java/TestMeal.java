import models.Drink;
import models.Food;
import models.Meal;
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
        meal = new Meal(new GregorianCalendar(2018,9,10));
    }

    @Test
    public void canGetDate(){
        assertEquals(new GregorianCalendar(2018,9,10), meal.getDate());
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


}
