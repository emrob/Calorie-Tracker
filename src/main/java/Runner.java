import db.DBHelper;
import models.*;

import java.util.GregorianCalendar;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Meal meal1 = new Meal(new GregorianCalendar(2018,5,5), 1500);
        DBHelper.saveOrUpdate(meal1);

        Food food1 = new Food("Banana", NutritionalRating.Green, 90, 2, "Snack", FoodCategory.Fruit, meal1);
        DBHelper.saveOrUpdate(food1);
        Food food2 = new Food("Chocolate", NutritionalRating.Red, 290, 1, "Snack", FoodCategory.Dairy, meal1);
        DBHelper.saveOrUpdate(food2);
        Food food3 = new Food("Pizza", NutritionalRating.Amber, 500, 1, "Main", FoodCategory.Carbohydrate, meal1);
        DBHelper.saveOrUpdate(food3);

        Drink drink1 = new Drink("Black Coffee", NutritionalRating.Green, 50, 3, 500, meal1);
        DBHelper.saveOrUpdate(drink1);
        Drink drink2 = new Drink("Water", NutritionalRating.Green, 0, 2, 800, meal1);
        DBHelper.saveOrUpdate(drink2);
        Drink drink3 = new Drink("Cola", NutritionalRating.Red, 150, 1, 800, meal1);
        DBHelper.saveOrUpdate(drink3);

    DBHelper.addFoodToMeal(food1, meal1);


    }
}

