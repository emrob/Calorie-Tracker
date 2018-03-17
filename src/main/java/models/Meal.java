package models;

import behaviours.IConsume;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Meal {

    private GregorianCalendar date;
    private ArrayList<IConsume> meals;
    private Food food;
    private Drink drink;

    public Meal(GregorianCalendar date) {

        this.meals = new ArrayList<IConsume>();
        this.date = date;

    }

    public ArrayList<IConsume> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<IConsume> meals) {
        this.meals = meals;
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
}

