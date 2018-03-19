import models.Drink;
import models.Meal;
import models.NutritionalRating;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrink {

    Drink drink;
    Meal meal;

    @Before public void before(){
        drink = new Drink("Milkshake", NutritionalRating.Red,500, 1, 600, meal);
    }

    @Test
    public void checkDrinkSize(){
        assertEquals(600, drink.getSize());
    }
}
