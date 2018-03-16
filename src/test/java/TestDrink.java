import models.Drink;
import models.NutritionalRating;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrink {

    Drink drink;

    @Before public void before(){
        drink = new Drink("Milkshake", NutritionalRating.Red,500, 600);
    }

    @Test
    public void checkDrinkSize(){
        assertEquals(600, drink.getSize())
    }
}
