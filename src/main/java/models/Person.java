package models;

import behaviours.IConsume;

import java.util.ArrayList;

public class Person {

    private ArrayList<IConsume> meals;
    private int dailyCalorieAllowance;

    public Person(ArrayList<IConsume> meals, int dailyCalorieAllowance) {
        this.meals = meals;
        this.dailyCalorieAllowance = dailyCalorieAllowance;
    }

    public ArrayList<IConsume> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<IConsume> meals) {
        this.meals = meals;
    }

    public int getDailyCalorieAllowance() {
        return dailyCalorieAllowance;
    }

    public void setDailyCalorieAllowance(int dailyCalorieAllowance) {
        this.dailyCalorieAllowance = dailyCalorieAllowance;
    }


    public int getMealSize(){
        return this.meals.size();
    }

    public void addFood(Food food){
        this.meals.add(food);
    }

    public void addDrink(Drink drink){
        this.meals.add(drink);
    }

    public int getCalorieTotal() {
        int total = 0;
        for (IConsume item : meals) {
            total += item.calculateCalories();
        }
        return total;
    }

    public int caloriesLeftToUse() {
        return dailyCalorieAllowance - getCalorieTotal();
    }

    public String calorieWarning(){
        getCalorieTotal();
        if (getCalorieTotal() > 2000)
            return "Warning, you've consumed more than your daily calorie allowance";
        else
            return "You have " + (getCalorieTotal()) + " calories left of your daily allowance";

    }

}
