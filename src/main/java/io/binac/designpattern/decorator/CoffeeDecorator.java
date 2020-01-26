package io.binac.designpattern.decorator;

public abstract class CoffeeDecorator extends Coffee {
    private final Coffee mCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.mCoffee = coffee;
    }

    @Override
    public int getCost() {
        return mCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return mCoffee.getIngredients();
    }
}
