package io.binac.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        System.out.println(coffee);

        coffee = new WithMilk(coffee);
        System.out.println(coffee);

        coffee = new WithSprinkles(coffee);
        System.out.println(coffee);
    }
}
