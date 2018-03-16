import models.Meal;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

public class TestMeal {

    Meal meal;

    @Before
    public void before(){
        meal = new Meal(new GregorianCalendar(2018,9,10));

    }

    @Test
    public void canGetDate(){
        assertEquals(new GregorianCalendar(2018,9,10), meal.getDate());
    }

    
}
