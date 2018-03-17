import db.DBHelper;
import models.Food;
import models.FoodCategory;
import models.NutritionalRating;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FoodDBTest {

    private Food food;

    @Before
    public void before() {
        food = new Food("Bread", NutritionalRating.Yellow, 100, 2, "Side", FoodCategory.Carbohydrate);
    }

    @After
    public void after() {
        DBHelper.delete(food);
    }

    @Test
    public void canSave() {
        List<Food> allFood = DBHelper.getAll(Food.class);
    }

    @Test
    public void canUpdate() {
        food.setMealType("Main");
        DBHelper.saveOrUpdate(food);
        assertEquals("Main", food.getMealType());
    }
}
