package io.binac.designpattern.decorator;

public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 6;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", milk";
    }
}
