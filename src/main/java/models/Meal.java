package models;

import behaviours.IConsume;

import java.util.ArrayList;

public class Meal {

    private String name;
    private ArrayList<IConsume> meals;

    public Meal(String name) {
        this.name = name;
        this.meals = new ArrayList<IConsume>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<IConsume> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<IConsume> meals) {
        this.meals = meals;
    }
    
}
