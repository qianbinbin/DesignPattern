package io.binac.decorator;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 22;
    }

    @Override
    public String getIngredients() {
        return "espresso";
    }

    @Override
    public String toString() {
        return "Cost: " + getCost() + "; Ingredients: " + getIngredients();
    }
}
