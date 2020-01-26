package io.binac.designpattern.decorator;

public abstract class Coffee {
    public abstract int getCost();

    public abstract String getIngredients();

    @Override
    public String toString() {
        return "Cost: " + getCost() + "; Ingredients: " + getIngredients();
    }
}
