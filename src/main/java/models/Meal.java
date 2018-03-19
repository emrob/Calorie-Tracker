package models;

import behaviours.IConsume;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "meals")
public class Meal {
    private int id;
    private GregorianCalendar date;
    private Set<Food> foods;
    private Set<Drink> drinks;

    public Meal(GregorianCalendar date, int dailyCalorieAllowance) {
        this.date = date;
        this.foods = new HashSet<Food>();
    }

    public Meal() {
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name= "date")
    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    @OneToMany(mappedBy = "meal", fetch = FetchType.EAGER)
    public Set<Food> getFoods() {
        return foods;
    }

    public void setFoods(Set<Food> foods) {
        this.foods = foods;
    }

    @OneToMany(mappedBy = "meal", fetch = FetchType.EAGER)
    public Set<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(Set<Drink> drinks) {
        this.drinks = drinks;
    }

    public void addFood(Food food){
        this.foods.add(food);
    }
}

