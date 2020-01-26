package io.binac.designpattern.decorator;

public class Espresso extends Coffee {
    @Override
    public int getCost() {
        return 22;
    }

    @Override
    public String getIngredients() {
        return "espresso";
    }
}
