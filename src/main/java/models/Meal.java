package models;

import behaviours.IConsume;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Meal {

    private GregorianCalendar date;
    private ArrayList<IConsume> meals;
    private int dailyCalorieAllowance;
    private Food food;
    private Drink drink;

    public Meal(GregorianCalendar date, int dailyCalorieAllowance) {
        this.date = date;
        this.dailyCalorieAllowance = dailyCalorieAllowance;
        this.meals = new ArrayList<IConsume>();


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

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
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

