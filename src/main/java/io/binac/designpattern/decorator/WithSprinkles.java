package io.binac.designpattern.decorator;

public class WithSprinkles extends CoffeeDecorator {
    public WithSprinkles(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", sprinkles";
    }
}
