import db.DBHelper;
import models.Food;
import models.FoodCategory;
import models.NutritionalRating;

public class Runner {

    public static void main(String[] args) {
        Food food1 = new Food("Banana", NutritionalRating.Green, 90, 3, "Snack", FoodCategory.Fruit);
        DBHelper.saveOrUpdate(food1);
    }
}
