package io.binac.decorator;

public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 6;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", milk";
    }
}
