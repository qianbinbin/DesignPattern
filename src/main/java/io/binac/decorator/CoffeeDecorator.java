package io.binac.decorator;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee mCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.mCoffee = coffee;
    }

    @Override
    public double getCost() {
        return mCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return mCoffee.getIngredients();
    }

    @Override
    public String toString() {
        return "Cost: " + getCost() + "; Ingredients: " + getIngredients();
    }
}
