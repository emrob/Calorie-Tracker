import db.DBHelper;
import models.Drink;
import models.Food;
import models.FoodCategory;
import models.NutritionalRating;

public class Runner {

    public static void main(String[] args) {
        Food food1 = new Food("Banana", NutritionalRating.Green, 90, 2, "Snack", FoodCategory.Fruit);
        DBHelper.saveOrUpdate(food1);
        Food food2 = new Food("Chocolate", NutritionalRating.Red, 290, 1, "Snack", FoodCategory.Fruit);
        DBHelper.saveOrUpdate(food2);

        Drink drink1 = new Drink("Black Coffee", NutritionalRating.Green, 50, 3, 500);
        DBHelper.saveOrUpdate(drink1);



    }
}
