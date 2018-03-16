package models;

import behaviours.IConsume;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Meal {

    private GregorianCalendar date;
    private ArrayList<IConsume> meals;

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
}
