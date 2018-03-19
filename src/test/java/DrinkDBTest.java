import db.DBHelper;
import models.Drink;
import models.Meal;
import models.NutritionalRating;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DrinkDBTest {
    private Drink drink;
    private Meal meal;

    @Before
    public void before(){
        drink = new Drink("Milkshake", NutritionalRating.Red,500, 1, 600, meal);
        DBHelper.saveOrUpdate(drink);
    }

    @After
    public void after(){
        DBHelper.delete(drink);
    }

    @Test
    public void canSave(){
        List<Drink> allDrinks = DBHelper.getAll(Drink.class);
    }

    @Test
    public void canUpdateDrink(){
        drink.setCalories(700);
        DBHelper.saveOrUpdate(drink);
        assertEquals(700, drink.getCalories());
    }
}
